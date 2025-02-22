package org.xtext.unipampa.erdsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.unipampa.erdsl.erDsl.ERModel
import org.eclipse.xtext.generator.IFileSystemAccessExtension3
import java.io.ByteArrayOutputStream
import net.sourceforge.plantuml.SourceStringReader
import java.io.ByteArrayInputStream
import org.xtext.unipampa.erdsl.erDsl.Relation

class OccurrenceDiagramGenerator extends AbstractGenerator {
	
	var String currentRelationshipName = null;
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {		
		
		val modeloER = input.contents.get(0) as ERModel

		for (r : modeloER.relations.filter[i|i.occurrence !== null]) {
			try {
				
				this.currentRelationshipName = r.name.toString
				
				for (diagramModel : input.contents.filter(typeof(ERModel))) {
					val plantUML = diagramModel.plotToPlantUML.toString

					if (fsa instanceof IFileSystemAccessExtension3) {

						val out = new ByteArrayOutputStream()

						new SourceStringReader(plantUML).generateImage(out)

						(fsa as IFileSystemAccessExtension3).generateFile(r.name.toLowerCase + "_OccurrenceDiagram.png",
							new ByteArrayInputStream(out.toByteArray))

//				fsa.generateFile(r.name.toLowerCase + "_OccurrenceDiagramDesc_Gen.puml", plantUML)
					} else {

						fsa.generateFile(r.name.toLowerCase + "_OccurrenceDiagramDesc_PartialGen.puml", plantUML)
					}
				}

			} catch (Exception e) {

				println(e.stackTrace.toString)

			}
			
			this.currentRelationshipName = null

		}

	}
	
	def private CharSequence plotToPlantUML(ERModel it) '''
	@startuml
	' - Esconde os (*letra*) dos objetos (E para entidade, C para classe, O para objetos, etc)
	' hide circle
	' - workaround para evitar problemas com os angulos do crows foot
	' skinparam linetype ortho
	skinparam titleBorderRoundCorner 15
	skinparam titleBorderThickness 1
	' skinparam titleBorderColor red
	' skinparam titleBackgroundColor CadetBlue
	scale 1.5
	' skinparam monochrome true
	header
	<b>Diagram generated by ERtext</b>
	endheader
	right footer <b>https://github.com/ProjetoDSL/ERDSL</b>
	title <b>Occurrence Diagram</b>\n«this.currentRelationshipName»
	«FOR e : relations.filter[i|i.occurrence !== null]»
		«IF e.name.equalsIgnoreCase(this.currentRelationshipName)»
			«e.plotToPlantUML»
		«ENDIF»
	«ENDFOR»
	@enduml
	'''
	
	def private CharSequence plotToPlantUML(Relation r) ''' 
		' top to bottom direction
		left to right direction
		«IF r.leftEnding.cardinality.equalsIgnoreCase("(0:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:1)")»
			«initDefaultObjects(r)»
			package relationship {
				object x1_y1
				object x2_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y3
			x2_y3 ---- y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:1)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality»{
				object x1
				object x2
			}	
			
			package «r.rightEnding.target.toString»«r.rightEnding.cardinality»{
				object y1
				object y2
				object y3
			}

			package relationship {
				object x1_y1
				object x2_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y3
			x2_y3 ---- y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:1)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality»{
				object x1
				object x2
				object x3
			}	
					
			package «r.rightEnding.target.toString»«r.rightEnding.cardinality» {
				object y1
				object y2
			}
			
			package relationship {
				object x1_y1
				object x3_y2
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x3 ---- x3_y2
			x3_y2 ---- y2
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:1)")»
			«initDefaultObjects(r)»
			package relationship {
				object x1_y1
				object x2_y2
				object x3_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y2
			x2_y2 ---- y2
			x3 ---- x3_y3 
			x3_y3 ---- y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:N)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality»{
				object x1
				object x2
				object x3
			}	
					
			package «r.rightEnding.target.toString»«r.rightEnding.cardinality»{
				object y1
				object y2
				object y3
				object y4
				object y5
				object y6
			}
			
			package relationship {
				object x1_y1
				object x1_y2
				object x2_y3
				object x2_y4
				object x3_y5
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x1 ---- x1_y2
			x1_y2 ---- y2
			x2 ---- x2_y3
			x2_y3 ---- y3
			x2 ---- x2_y4
			x2_y4 ---- y4
			x3 ---- x3_y5
			x3_y5 ---- y5
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:N)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality»{
				object x1
				object x2
				object x3
			}	

			package «r.rightEnding.target.toString»«r.rightEnding.cardinality»{
				object y1
				object y2
				object y3
				object y4
				object y5
				object y6
			}
			
			package relationship {
				object x1_y1
				object x1_y2
				object x1_y3
				object x2_y4
				object x2_y5
				object x3_y6
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x1 ---- x1_y2
			x1_y2 ---- y2
			x1 ---- x1_y3
			x1_y3 ---- y3
			x2 ---- x2_y4
			x2_y4 ---- y4
			x2 ---- x2_y5
			x2_y5 ---- y5
			x3 ---- x3_y6
			x3_y6 ---- y6
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:1)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality»{
				object x1
				object x2
				object x3
				object x4
				object x5
				object x6
			}	
					
			package «r.rightEnding.target.toString»«r.rightEnding.cardinality»{
				object y1
				object y2
				object y3
			}
			
			package relationship {
				object x1_y1
				object x2_y1
				object x3_y2
				object x4_y2
				object x5_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y1
			x2_y1 ---- y1
			x3 ---- x3_y2
			x3_y2 ---- y2
			x4 ---- x4_y2 
			x4_y2 ---- y2
			x5 ---- x5_y3
			x5_y3 ---- y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:1)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality»{
				object x1
				object x2
				object x3
				object x4
				object x5
				object x6
			}	

			package «r.rightEnding.target.toString»«r.rightEnding.cardinality»{
				object y1
				object y2
				object y3
			}
			
			package relationship {
				object x1_y1
				object x2_y1
				object x3_y1
				object x4_y2
				object x5_y2
				object x6_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y1
			x2_y1 ---- y1
			x3 ---- x3_y1
			x3_y1 - y1
			x4 ---- x4_y2
			x4_y2 ---- y2
			x5 ---- x5_y2
			x5_y2 ---- y2
			x6 ---- x6_y3
			x6_y3 ----  y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:1)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality» {
				object x1
				object x2
				object x3
				object x4
				object x5
				object x6
			}	
					
			package «r.rightEnding.cardinality»«r.rightEnding.target.toString» {
				object y1
				object y2
				object y3
				object y4
			}
			
			package relationship {
				object x1_y1
				object x2_y1
				object x3_y2
				object x4_y2
				object x5_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y1
			x2_y1 ---- y1
			x3 ---- x3_y2
			x3_y2 ---- y2
			x4 ---- x4_y2
			x4_y2 ---- y2
			x5 ---- x5_y3
			x5_y3 ---- y3
			
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:N)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality» {
				object x1
				object x2
				object x3
				object x4    
			}	
					
			package «r.rightEnding.cardinality»«r.rightEnding.target.toString» {
				object y1
				object y2
				object y3
				object y4
				object y5
				object y6
			}
			
			package relationship {
				object x1_y1
				object x1_y2
				object x2_y3
				object x2_y4
				object x3_y5
			}

			x1 ---- x1_y1
			x1_y1 ---- y1
			x1 ---- x1_y2
			x1_y2 ---- y2
			x2 ---- x2_y3
			x2_y3 ---- y3
			x2 ---- x2_y4
			x2_y4 ---- y4
			x3 ---- x3_y5
			x3_y5 ---- y5
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:1)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:N)")»
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality» {
				object x1
				object x2
				object x3
				object x4    
			}	
					
			package «r.rightEnding.cardinality»«r.rightEnding.target.toString» {
				object y1
				object y2
				object y3
				object y4
				object y5
				object y6
			}
			
			package relationship {
				object x1_y1
				object x1_y2
				object x2_y3
				object x2_y4
				object x2_y5
				object x3_y6
			}

			x1 ---- x1_y1
			x1_y1 ---- y1
			x1 ---- x1_y2
			x1_y2 ---- y2
			x2 ---- x2_y3
			x2_y3 ---- y3
			x2 ---- x2_y4
			x2_y4 ---- y4
			x2 ---- x2_y5
			x2_y5 ---- y5
			x3 ---- x3_y6
			x3_y6 ---- y6
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:1)")»			
			package «r.leftEnding.target.toString»«r.leftEnding.cardinality» {
				object x1
				object x2
				object x3
				object x4
				object x5
				object x6
			}	
					
			package «r.rightEnding.cardinality»«r.rightEnding.target.toString» {
				object y1
				object y2
				object y3
				object y4
			}
			
			package relationship {
				object x1_y1
				object x2_y1
				object x3_y2
				object x4_y2
				object x5_y2
				object x6_y3
			}

			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y1
			x2_y1 ---- y1
			x3 ---- x3_y2
			x3_y2 ---- y2
			x4 ---- x4_y2
			x4_y2 ---- y2
			x5 ---- x5_y2
			x5_y2 ---- y2
			x6 ---- x6_y3
			x6_y3 ---- y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:N)")»
			«initDefaultObjects(r)»
			package relationship {
				object x1_y1
				object x1_y3
				object x2_y1
				object x2_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x1 ---- x1_y3
			x1_y3 ---- y3
			x2 ---- x2_y1
			x2_y1 ---- y1
			x2 ---- x2_y3
			x2_y3 ---- y3
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:N)")»
			«initDefaultObjects(r)»
			package relationship {
				object x1_y1
				object x1_y2
				object x1_y3
				object x2_y1
				object x2_y3
				object x3_y2
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x1 ---- x1_y2
			x1_y2 ---- y2
			x1 ---- x1_y3
			x1_y3 ---- y3
			x2 ---- x2_y1
			x2_y1 ---- y1
			x2 ---- x2_y3
			x2_y3 ---- y3
			x3 ---- x3_y2
			x3_y2 ---- y2
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(0:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(1:N)")»
			«initDefaultObjects(r)»
			package relationship {
				object x1_y1
				object x2_y1
				object x3_y1
				object x1_y2
				object x3_y2
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y1
			x2_y1 ---- y1
			x3 ---- x3_y1
			x3_y1 ---- y1
			x1 ---- x1_y2
			x1_y2 ----y2
			x3 ---- x3_y2
			x3_y2 ---- y2
		«ELSEIF r.leftEnding.cardinality.equalsIgnoreCase("(1:N)") && r.rightEnding.cardinality.equalsIgnoreCase("(0:N)")»
			«initDefaultObjects(r)»
			package relationship {
				object x1_y1
				object x2_y2
				object x1_y3
				object x2_y1
				object x2_y3
			}
			
			x1 ---- x1_y1
			x1_y1 ---- y1
			x2 ---- x2_y2
			x2_y2 ---- y2
			x1 ---- x1_y3
			x1_y3 ---- y3
			x2 ---- x2_y1
			x2_y1 ---- y1
			x2 ---- x2_y3
			x2_y3 ---- y3
		«ENDIF»		
	'''
	
	def private CharSequence initDefaultObjects(Relation r) '''
		package «r.leftEnding.target.toString»«r.leftEnding.cardinality» {
			object x1
			object x2
			object x3    
		}	
				
		package «r.rightEnding.cardinality»«r.rightEnding.target.toString» {
			object y1
			object y2
			object y3
		}
	'''
	
}