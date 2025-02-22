package org.xtext.unipampa.erdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.unipampa.erdsl.services.ErDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GenerateOccurrenceDiagram", "PartialOverlapped", "PartialDisjoint", "TotalOverlapped", "TotalDisjoint", "LogicalSchema", "Relationships", "IsIdentifier", "PostgreSQL", "Entities", "Generate", "Datetime", "Diagram", "Boolean", "Relates", "Domain", "Double", "String", "LeftParenthesisDigitZeroColonDigitOneRightParenthesis", "N", "LeftParenthesisDigitOneColonDigitOneRightParenthesis", "N_1", "MySQL", "Money", "File", "All", "Int", "Is", "Comma", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int All=29;
    public static final int N_1=25;
    public static final int PostgreSQL=12;
    public static final int String=21;
    public static final int TotalOverlapped=7;
    public static final int GenerateOccurrenceDiagram=4;
    public static final int MySQL=26;
    public static final int Boolean=17;
    public static final int RightSquareBracket=35;
    public static final int Relates=18;
    public static final int RULE_ID=38;
    public static final int PartialOverlapped=5;
    public static final int LogicalSchema=9;
    public static final int IsIdentifier=11;
    public static final int Double=20;
    public static final int RULE_INT=39;
    public static final int RULE_ML_COMMENT=41;
    public static final int LeftSquareBracket=34;
    public static final int Domain=19;
    public static final int File=28;
    public static final int PartialDisjoint=6;
    public static final int Is=31;
    public static final int RULE_STRING=40;
    public static final int LeftParenthesisDigitZeroColonDigitOneRightParenthesis=22;
    public static final int N=23;
    public static final int Int=30;
    public static final int RULE_SL_COMMENT=42;
    public static final int Money=27;
    public static final int Comma=32;
    public static final int Relationships=10;
    public static final int Generate=14;
    public static final int RightCurlyBracket=37;
    public static final int EOF=-1;
    public static final int TotalDisjoint=8;
    public static final int Datetime=15;
    public static final int RULE_WS=43;
    public static final int LeftCurlyBracket=36;
    public static final int RULE_ANY_OTHER=44;
    public static final int Entities=13;
    public static final int Diagram=16;
    public static final int LeftParenthesisDigitOneColonDigitOneRightParenthesis=24;
    public static final int Semicolon=33;

    // delegates
    // delegators


        public InternalErDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalErDslParser.g"; }



     	private ErDslGrammarAccess grammarAccess;

        public InternalErDslParser(TokenStream input, ErDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ERModel";
       	}

       	@Override
       	protected ErDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleERModel"
    // InternalErDslParser.g:58:1: entryRuleERModel returns [EObject current=null] : iv_ruleERModel= ruleERModel EOF ;
    public final EObject entryRuleERModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERModel = null;


        try {
            // InternalErDslParser.g:58:48: (iv_ruleERModel= ruleERModel EOF )
            // InternalErDslParser.g:59:2: iv_ruleERModel= ruleERModel EOF
            {
             newCompositeNode(grammarAccess.getERModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERModel=ruleERModel();

            state._fsp--;

             current =iv_ruleERModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERModel"


    // $ANTLR start "ruleERModel"
    // InternalErDslParser.g:65:1: ruleERModel returns [EObject current=null] : ( (otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= Semicolon (otherlv_5= Entities otherlv_6= LeftCurlyBracket ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= RightCurlyBracket otherlv_9= Semicolon ) (otherlv_10= Relationships otherlv_11= LeftCurlyBracket ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= RightCurlyBracket otherlv_14= Semicolon ) ) ;
    public final EObject ruleERModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetGenerator_1_1=null;
        Token lv_targetGenerator_1_2=null;
        Token lv_targetGenerator_1_3=null;
        Token lv_targetGenerator_1_4=null;
        Token lv_targetGenerator_1_5=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_domain_3_0 = null;

        EObject lv_entities_7_0 = null;

        EObject lv_relations_12_0 = null;



        	enterRule();

        try {
            // InternalErDslParser.g:71:2: ( ( (otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= Semicolon (otherlv_5= Entities otherlv_6= LeftCurlyBracket ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= RightCurlyBracket otherlv_9= Semicolon ) (otherlv_10= Relationships otherlv_11= LeftCurlyBracket ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= RightCurlyBracket otherlv_14= Semicolon ) ) )
            // InternalErDslParser.g:72:2: ( (otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= Semicolon (otherlv_5= Entities otherlv_6= LeftCurlyBracket ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= RightCurlyBracket otherlv_9= Semicolon ) (otherlv_10= Relationships otherlv_11= LeftCurlyBracket ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= RightCurlyBracket otherlv_14= Semicolon ) )
            {
            // InternalErDslParser.g:72:2: ( (otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= Semicolon (otherlv_5= Entities otherlv_6= LeftCurlyBracket ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= RightCurlyBracket otherlv_9= Semicolon ) (otherlv_10= Relationships otherlv_11= LeftCurlyBracket ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= RightCurlyBracket otherlv_14= Semicolon ) )
            // InternalErDslParser.g:73:3: (otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= Semicolon (otherlv_5= Entities otherlv_6= LeftCurlyBracket ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= RightCurlyBracket otherlv_9= Semicolon ) (otherlv_10= Relationships otherlv_11= LeftCurlyBracket ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= RightCurlyBracket otherlv_14= Semicolon )
            {
            // InternalErDslParser.g:73:3: (otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Generate) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalErDslParser.g:74:4: otherlv_0= Generate ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) ) otherlv_2= Semicolon
                    {
                    otherlv_0=(Token)match(input,Generate,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getERModelAccess().getGenerateKeyword_0_0());
                    			
                    // InternalErDslParser.g:78:4: ( ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) ) )
                    // InternalErDslParser.g:79:5: ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) )
                    {
                    // InternalErDslParser.g:79:5: ( (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All ) )
                    // InternalErDslParser.g:80:6: (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All )
                    {
                    // InternalErDslParser.g:80:6: (lv_targetGenerator_1_1= LogicalSchema | lv_targetGenerator_1_2= PostgreSQL | lv_targetGenerator_1_3= MySQL | lv_targetGenerator_1_4= Diagram | lv_targetGenerator_1_5= All )
                    int alt1=5;
                    switch ( input.LA(1) ) {
                    case LogicalSchema:
                        {
                        alt1=1;
                        }
                        break;
                    case PostgreSQL:
                        {
                        alt1=2;
                        }
                        break;
                    case MySQL:
                        {
                        alt1=3;
                        }
                        break;
                    case Diagram:
                        {
                        alt1=4;
                        }
                        break;
                    case All:
                        {
                        alt1=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // InternalErDslParser.g:81:7: lv_targetGenerator_1_1= LogicalSchema
                            {
                            lv_targetGenerator_1_1=(Token)match(input,LogicalSchema,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_1, grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDslParser.g:92:7: lv_targetGenerator_1_2= PostgreSQL
                            {
                            lv_targetGenerator_1_2=(Token)match(input,PostgreSQL,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_2, grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDslParser.g:103:7: lv_targetGenerator_1_3= MySQL
                            {
                            lv_targetGenerator_1_3=(Token)match(input,MySQL,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_3, grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDslParser.g:114:7: lv_targetGenerator_1_4= Diagram
                            {
                            lv_targetGenerator_1_4=(Token)match(input,Diagram,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_4, grammarAccess.getERModelAccess().getTargetGeneratorDiagramKeyword_0_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalErDslParser.g:125:7: lv_targetGenerator_1_5= All
                            {
                            lv_targetGenerator_1_5=(Token)match(input,All,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_5, grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,Semicolon,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getERModelAccess().getSemicolonKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalErDslParser.g:143:3: ( (lv_domain_3_0= ruleDomain ) )
            // InternalErDslParser.g:144:4: (lv_domain_3_0= ruleDomain )
            {
            // InternalErDslParser.g:144:4: (lv_domain_3_0= ruleDomain )
            // InternalErDslParser.g:145:5: lv_domain_3_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_domain_3_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERModelRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_3_0,
            						"org.xtext.unipampa.erdsl.ErDsl.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getERModelAccess().getSemicolonKeyword_2());
            		
            // InternalErDslParser.g:166:3: (otherlv_5= Entities otherlv_6= LeftCurlyBracket )
            // InternalErDslParser.g:167:4: otherlv_5= Entities otherlv_6= LeftCurlyBracket
            {
            otherlv_5=(Token)match(input,Entities,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getERModelAccess().getEntitiesKeyword_3_0());
            			
            otherlv_6=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            				newLeafNode(otherlv_6, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1());
            			

            }

            // InternalErDslParser.g:176:3: ( (lv_entities_7_0= ruleEntity ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalErDslParser.g:177:4: (lv_entities_7_0= ruleEntity )
            	    {
            	    // InternalErDslParser.g:177:4: (lv_entities_7_0= ruleEntity )
            	    // InternalErDslParser.g:178:5: lv_entities_7_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_entities_7_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_7_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalErDslParser.g:195:3: (otherlv_8= RightCurlyBracket otherlv_9= Semicolon )
            // InternalErDslParser.g:196:4: otherlv_8= RightCurlyBracket otherlv_9= Semicolon
            {
            otherlv_8=(Token)match(input,RightCurlyBracket,FOLLOW_4); 

            				newLeafNode(otherlv_8, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_0());
            			
            otherlv_9=(Token)match(input,Semicolon,FOLLOW_10); 

            				newLeafNode(otherlv_9, grammarAccess.getERModelAccess().getSemicolonKeyword_5_1());
            			

            }

            // InternalErDslParser.g:205:3: (otherlv_10= Relationships otherlv_11= LeftCurlyBracket )
            // InternalErDslParser.g:206:4: otherlv_10= Relationships otherlv_11= LeftCurlyBracket
            {
            otherlv_10=(Token)match(input,Relationships,FOLLOW_7); 

            				newLeafNode(otherlv_10, grammarAccess.getERModelAccess().getRelationshipsKeyword_6_0());
            			
            otherlv_11=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            				newLeafNode(otherlv_11, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_6_1());
            			

            }

            // InternalErDslParser.g:215:3: ( (lv_relations_12_0= ruleRelation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDslParser.g:216:4: (lv_relations_12_0= ruleRelation )
            	    {
            	    // InternalErDslParser.g:216:4: (lv_relations_12_0= ruleRelation )
            	    // InternalErDslParser.g:217:5: lv_relations_12_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_relations_12_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_12_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalErDslParser.g:234:3: (otherlv_13= RightCurlyBracket otherlv_14= Semicolon )
            // InternalErDslParser.g:235:4: otherlv_13= RightCurlyBracket otherlv_14= Semicolon
            {
            otherlv_13=(Token)match(input,RightCurlyBracket,FOLLOW_4); 

            				newLeafNode(otherlv_13, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_8_0());
            			
            otherlv_14=(Token)match(input,Semicolon,FOLLOW_2); 

            				newLeafNode(otherlv_14, grammarAccess.getERModelAccess().getSemicolonKeyword_8_1());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERModel"


    // $ANTLR start "entryRuleDomain"
    // InternalErDslParser.g:248:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalErDslParser.g:248:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalErDslParser.g:249:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalErDslParser.g:255:1: ruleDomain returns [EObject current=null] : (otherlv_0= Domain ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalErDslParser.g:261:2: ( (otherlv_0= Domain ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalErDslParser.g:262:2: (otherlv_0= Domain ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalErDslParser.g:262:2: (otherlv_0= Domain ( (lv_name_1_0= RULE_ID ) ) )
            // InternalErDslParser.g:263:3: otherlv_0= Domain ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Domain,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalErDslParser.g:267:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalErDslParser.g:268:4: (lv_name_1_0= RULE_ID )
            {
            // InternalErDslParser.g:268:4: (lv_name_1_0= RULE_ID )
            // InternalErDslParser.g:269:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleAttribute"
    // InternalErDslParser.g:289:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalErDslParser.g:289:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalErDslParser.g:290:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalErDslParser.g:296:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= IsIdentifier ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isKey_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalErDslParser.g:302:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= IsIdentifier ) )? ) )
            // InternalErDslParser.g:303:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= IsIdentifier ) )? )
            {
            // InternalErDslParser.g:303:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= IsIdentifier ) )? )
            // InternalErDslParser.g:304:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= IsIdentifier ) )?
            {
            // InternalErDslParser.g:304:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDslParser.g:305:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDslParser.g:305:4: (lv_name_0_0= RULE_ID )
            // InternalErDslParser.g:306:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalErDslParser.g:322:3: ( (lv_type_1_0= ruleDataType ) )
            // InternalErDslParser.g:323:4: (lv_type_1_0= ruleDataType )
            {
            // InternalErDslParser.g:323:4: (lv_type_1_0= ruleDataType )
            // InternalErDslParser.g:324:5: lv_type_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_1_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.unipampa.erdsl.ErDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalErDslParser.g:341:3: ( (lv_isKey_2_0= IsIdentifier ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IsIdentifier) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalErDslParser.g:342:4: (lv_isKey_2_0= IsIdentifier )
                    {
                    // InternalErDslParser.g:342:4: (lv_isKey_2_0= IsIdentifier )
                    // InternalErDslParser.g:343:5: lv_isKey_2_0= IsIdentifier
                    {
                    lv_isKey_2_0=(Token)match(input,IsIdentifier,FOLLOW_2); 

                    					newLeafNode(lv_isKey_2_0, grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", lv_isKey_2_0 != null, "isIdentifier");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalErDslParser.g:359:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalErDslParser.g:359:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalErDslParser.g:360:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalErDslParser.g:366:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_generalization_2_1=null;
        Token lv_generalization_2_2=null;
        Token lv_generalization_2_3=null;
        Token lv_generalization_2_4=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalErDslParser.g:372:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket )? ) )
            // InternalErDslParser.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket )? )
            {
            // InternalErDslParser.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket )? )
            // InternalErDslParser.g:374:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket )?
            {
            // InternalErDslParser.g:374:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDslParser.g:375:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDslParser.g:375:4: (lv_name_0_0= RULE_ID )
            // InternalErDslParser.g:376:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalErDslParser.g:392:3: (otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Is) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDslParser.g:393:4: otherlv_1= Is ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,Is,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getIsKeyword_1_0());
                    			
                    // InternalErDslParser.g:397:4: ( ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) ) )
                    // InternalErDslParser.g:398:5: ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) )
                    {
                    // InternalErDslParser.g:398:5: ( (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped ) )
                    // InternalErDslParser.g:399:6: (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped )
                    {
                    // InternalErDslParser.g:399:6: (lv_generalization_2_1= TotalDisjoint | lv_generalization_2_2= TotalOverlapped | lv_generalization_2_3= PartialDisjoint | lv_generalization_2_4= PartialOverlapped )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case TotalDisjoint:
                        {
                        alt6=1;
                        }
                        break;
                    case TotalOverlapped:
                        {
                        alt6=2;
                        }
                        break;
                    case PartialDisjoint:
                        {
                        alt6=3;
                        }
                        break;
                    case PartialOverlapped:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalErDslParser.g:400:7: lv_generalization_2_1= TotalDisjoint
                            {
                            lv_generalization_2_1=(Token)match(input,TotalDisjoint,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_1, grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDslParser.g:411:7: lv_generalization_2_2= TotalOverlapped
                            {
                            lv_generalization_2_2=(Token)match(input,TotalOverlapped,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_2, grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDslParser.g:422:7: lv_generalization_2_3= PartialDisjoint
                            {
                            lv_generalization_2_3=(Token)match(input,PartialDisjoint,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_3, grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDslParser.g:433:7: lv_generalization_2_4= PartialOverlapped
                            {
                            lv_generalization_2_4=(Token)match(input,PartialOverlapped,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_4, grammarAccess.getEntityAccess().getGeneralizationPartialOverlappedKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalErDslParser.g:446:4: ( (otherlv_3= RULE_ID ) )
                    // InternalErDslParser.g:447:5: (otherlv_3= RULE_ID )
                    {
                    // InternalErDslParser.g:447:5: (otherlv_3= RULE_ID )
                    // InternalErDslParser.g:448:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalErDslParser.g:460:3: (otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftCurlyBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalErDslParser.g:461:4: otherlv_4= LeftCurlyBracket ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= RightCurlyBracket
                    {
                    otherlv_4=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalErDslParser.g:465:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalErDslParser.g:466:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalErDslParser.g:466:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalErDslParser.g:467:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"org.xtext.unipampa.erdsl.ErDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErDslParser.g:484:4: (otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalErDslParser.g:485:5: otherlv_6= Comma ( (lv_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalErDslParser.g:489:5: ( (lv_attributes_7_0= ruleAttribute ) )
                    	    // InternalErDslParser.g:490:6: (lv_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalErDslParser.g:490:6: (lv_attributes_7_0= ruleAttribute )
                    	    // InternalErDslParser.g:491:7: lv_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_7_0,
                    	    								"org.xtext.unipampa.erdsl.ErDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalErDslParser.g:518:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalErDslParser.g:518:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalErDslParser.g:519:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalErDslParser.g:525:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket ) (otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket )* ( (lv_occurrence_11_0= GenerateOccurrenceDiagram ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_occurrence_11_0=null;
        EObject lv_leftEnding_2_0 = null;

        EObject lv_rightEnding_4_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalErDslParser.g:531:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket ) (otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket )* ( (lv_occurrence_11_0= GenerateOccurrenceDiagram ) )? ) )
            // InternalErDslParser.g:532:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket ) (otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket )* ( (lv_occurrence_11_0= GenerateOccurrenceDiagram ) )? )
            {
            // InternalErDslParser.g:532:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket ) (otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket )* ( (lv_occurrence_11_0= GenerateOccurrenceDiagram ) )? )
            // InternalErDslParser.g:533:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket ) (otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket )* ( (lv_occurrence_11_0= GenerateOccurrenceDiagram ) )?
            {
            // InternalErDslParser.g:533:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDslParser.g:534:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDslParser.g:534:4: (lv_name_0_0= RULE_ID )
            // InternalErDslParser.g:535:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalErDslParser.g:551:3: (otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket )
            // InternalErDslParser.g:552:4: otherlv_1= LeftSquareBracket ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= Relates ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= RightSquareBracket
            {
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalErDslParser.g:556:4: ( (lv_leftEnding_2_0= ruleRelationSideLeft ) )
            // InternalErDslParser.g:557:5: (lv_leftEnding_2_0= ruleRelationSideLeft )
            {
            // InternalErDslParser.g:557:5: (lv_leftEnding_2_0= ruleRelationSideLeft )
            // InternalErDslParser.g:558:6: lv_leftEnding_2_0= ruleRelationSideLeft
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getLeftEndingRelationSideLeftParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_18);
            lv_leftEnding_2_0=ruleRelationSideLeft();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationRule());
            						}
            						set(
            							current,
            							"leftEnding",
            							lv_leftEnding_2_0,
            							"org.xtext.unipampa.erdsl.ErDsl.RelationSideLeft");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,Relates,FOLLOW_19); 

            				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelatesKeyword_1_2());
            			
            // InternalErDslParser.g:579:4: ( (lv_rightEnding_4_0= ruleRelationSideRight ) )
            // InternalErDslParser.g:580:5: (lv_rightEnding_4_0= ruleRelationSideRight )
            {
            // InternalErDslParser.g:580:5: (lv_rightEnding_4_0= ruleRelationSideRight )
            // InternalErDslParser.g:581:6: lv_rightEnding_4_0= ruleRelationSideRight
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getRightEndingRelationSideRightParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_20);
            lv_rightEnding_4_0=ruleRelationSideRight();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationRule());
            						}
            						set(
            							current,
            							"rightEnding",
            							lv_rightEnding_4_0,
            							"org.xtext.unipampa.erdsl.ErDsl.RelationSideRight");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_21); 

            				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4());
            			

            }

            // InternalErDslParser.g:603:3: (otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LeftCurlyBracket) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErDslParser.g:604:4: otherlv_6= LeftCurlyBracket ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= RightCurlyBracket
            	    {
            	    otherlv_6=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalErDslParser.g:608:4: ( (lv_attributes_7_0= ruleAttribute ) )
            	    // InternalErDslParser.g:609:5: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalErDslParser.g:609:5: (lv_attributes_7_0= ruleAttribute )
            	    // InternalErDslParser.g:610:6: lv_attributes_7_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_7_0,
            	    							"org.xtext.unipampa.erdsl.ErDsl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalErDslParser.g:627:4: (otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==Comma) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalErDslParser.g:628:5: otherlv_8= Comma ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,Comma,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getCommaKeyword_2_2_0());
            	    	    				
            	    	    // InternalErDslParser.g:632:5: ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    // InternalErDslParser.g:633:6: (lv_attributes_9_0= ruleAttribute )
            	    	    {
            	    	    // InternalErDslParser.g:633:6: (lv_attributes_9_0= ruleAttribute )
            	    	    // InternalErDslParser.g:634:7: lv_attributes_9_0= ruleAttribute
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_attributes_9_0=ruleAttribute();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getRelationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"attributes",
            	    	    								lv_attributes_9_0,
            	    	    								"org.xtext.unipampa.erdsl.ErDsl.Attribute");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,RightCurlyBracket,FOLLOW_21); 

            	    				newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalErDslParser.g:657:3: ( (lv_occurrence_11_0= GenerateOccurrenceDiagram ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GenerateOccurrenceDiagram) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErDslParser.g:658:4: (lv_occurrence_11_0= GenerateOccurrenceDiagram )
                    {
                    // InternalErDslParser.g:658:4: (lv_occurrence_11_0= GenerateOccurrenceDiagram )
                    // InternalErDslParser.g:659:5: lv_occurrence_11_0= GenerateOccurrenceDiagram
                    {
                    lv_occurrence_11_0=(Token)match(input,GenerateOccurrenceDiagram,FOLLOW_2); 

                    					newLeafNode(lv_occurrence_11_0, grammarAccess.getRelationAccess().getOccurrenceGenerateOccurrenceDiagramKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationRule());
                    					}
                    					setWithLastConsumed(current, "occurrence", lv_occurrence_11_0, "@generateOccurrenceDiagram");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationSideRight"
    // InternalErDslParser.g:675:1: entryRuleRelationSideRight returns [EObject current=null] : iv_ruleRelationSideRight= ruleRelationSideRight EOF ;
    public final EObject entryRuleRelationSideRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSideRight = null;


        try {
            // InternalErDslParser.g:675:58: (iv_ruleRelationSideRight= ruleRelationSideRight EOF )
            // InternalErDslParser.g:676:2: iv_ruleRelationSideRight= ruleRelationSideRight EOF
            {
             newCompositeNode(grammarAccess.getRelationSideRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationSideRight=ruleRelationSideRight();

            state._fsp--;

             current =iv_ruleRelationSideRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationSideRight"


    // $ANTLR start "ruleRelationSideRight"
    // InternalErDslParser.g:682:1: ruleRelationSideRight returns [EObject current=null] : ( ( ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRelationSideRight() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_0_1=null;
        Token lv_cardinality_0_2=null;
        Token lv_cardinality_0_3=null;
        Token lv_cardinality_0_4=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalErDslParser.g:688:2: ( ( ( ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalErDslParser.g:689:2: ( ( ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalErDslParser.g:689:2: ( ( ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=LeftParenthesisDigitZeroColonDigitOneRightParenthesis && LA14_0<=N_1)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalErDslParser.g:690:3: ( ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalErDslParser.g:690:3: ( ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalErDslParser.g:691:4: ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalErDslParser.g:691:4: ( ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) ) )
                    // InternalErDslParser.g:692:5: ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) )
                    {
                    // InternalErDslParser.g:692:5: ( (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 ) )
                    // InternalErDslParser.g:693:6: (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 )
                    {
                    // InternalErDslParser.g:693:6: (lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_0_3= N | lv_cardinality_0_4= N_1 )
                    int alt13=4;
                    switch ( input.LA(1) ) {
                    case LeftParenthesisDigitZeroColonDigitOneRightParenthesis:
                        {
                        alt13=1;
                        }
                        break;
                    case LeftParenthesisDigitOneColonDigitOneRightParenthesis:
                        {
                        alt13=2;
                        }
                        break;
                    case N:
                        {
                        alt13=3;
                        }
                        break;
                    case N_1:
                        {
                        alt13=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalErDslParser.g:694:7: lv_cardinality_0_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                            {
                            lv_cardinality_0_1=(Token)match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_1, grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDslParser.g:705:7: lv_cardinality_0_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis
                            {
                            lv_cardinality_0_2=(Token)match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_2, grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDslParser.g:716:7: lv_cardinality_0_3= N
                            {
                            lv_cardinality_0_3=(Token)match(input,N,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_3, grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDslParser.g:727:7: lv_cardinality_0_4= N_1
                            {
                            lv_cardinality_0_4=(Token)match(input,N_1,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_4, grammarAccess.getRelationSideRightAccess().getCardinality1NKeyword_0_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalErDslParser.g:740:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDslParser.g:741:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDslParser.g:741:5: (otherlv_1= RULE_ID )
                    // InternalErDslParser.g:742:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationSideRightRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:755:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalErDslParser.g:755:3: ( (otherlv_2= RULE_ID ) )
                    // InternalErDslParser.g:756:4: (otherlv_2= RULE_ID )
                    {
                    // InternalErDslParser.g:756:4: (otherlv_2= RULE_ID )
                    // InternalErDslParser.g:757:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationSideRightRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationSideRight"


    // $ANTLR start "entryRuleRelationSideLeft"
    // InternalErDslParser.g:772:1: entryRuleRelationSideLeft returns [EObject current=null] : iv_ruleRelationSideLeft= ruleRelationSideLeft EOF ;
    public final EObject entryRuleRelationSideLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSideLeft = null;


        try {
            // InternalErDslParser.g:772:57: (iv_ruleRelationSideLeft= ruleRelationSideLeft EOF )
            // InternalErDslParser.g:773:2: iv_ruleRelationSideLeft= ruleRelationSideLeft EOF
            {
             newCompositeNode(grammarAccess.getRelationSideLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationSideLeft=ruleRelationSideLeft();

            state._fsp--;

             current =iv_ruleRelationSideLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationSideLeft"


    // $ANTLR start "ruleRelationSideLeft"
    // InternalErDslParser.g:779:1: ruleRelationSideLeft returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) ) ) ) ;
    public final EObject ruleRelationSideLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        Token lv_cardinality_2_4=null;


        	enterRule();

        try {
            // InternalErDslParser.g:785:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) ) ) ) )
            // InternalErDslParser.g:786:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) ) ) )
            {
            // InternalErDslParser.g:786:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||LA16_1==Relates) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=LeftParenthesisDigitZeroColonDigitOneRightParenthesis && LA16_1<=N_1)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalErDslParser.g:787:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalErDslParser.g:787:3: ( (otherlv_0= RULE_ID ) )
                    // InternalErDslParser.g:788:4: (otherlv_0= RULE_ID )
                    {
                    // InternalErDslParser.g:788:4: (otherlv_0= RULE_ID )
                    // InternalErDslParser.g:789:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationSideLeftRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:801:3: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) ) )
                    {
                    // InternalErDslParser.g:801:3: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) ) )
                    // InternalErDslParser.g:802:4: ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) )
                    {
                    // InternalErDslParser.g:802:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDslParser.g:803:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDslParser.g:803:5: (otherlv_1= RULE_ID )
                    // InternalErDslParser.g:804:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationSideLeftRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_1, grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalErDslParser.g:815:4: ( ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) ) )
                    // InternalErDslParser.g:816:5: ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) )
                    {
                    // InternalErDslParser.g:816:5: ( (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 ) )
                    // InternalErDslParser.g:817:6: (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 )
                    {
                    // InternalErDslParser.g:817:6: (lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis | lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis | lv_cardinality_2_3= N | lv_cardinality_2_4= N_1 )
                    int alt15=4;
                    switch ( input.LA(1) ) {
                    case LeftParenthesisDigitZeroColonDigitOneRightParenthesis:
                        {
                        alt15=1;
                        }
                        break;
                    case LeftParenthesisDigitOneColonDigitOneRightParenthesis:
                        {
                        alt15=2;
                        }
                        break;
                    case N:
                        {
                        alt15=3;
                        }
                        break;
                    case N_1:
                        {
                        alt15=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalErDslParser.g:818:7: lv_cardinality_2_1= LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                            {
                            lv_cardinality_2_1=(Token)match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_1, grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDslParser.g:829:7: lv_cardinality_2_2= LeftParenthesisDigitOneColonDigitOneRightParenthesis
                            {
                            lv_cardinality_2_2=(Token)match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_2, grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDslParser.g:840:7: lv_cardinality_2_3= N
                            {
                            lv_cardinality_2_3=(Token)match(input,N,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_3, grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDslParser.g:851:7: lv_cardinality_2_4= N_1
                            {
                            lv_cardinality_2_4=(Token)match(input,N_1,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_4, grammarAccess.getRelationSideLeftAccess().getCardinality1NKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationSideLeft"


    // $ANTLR start "ruleDataType"
    // InternalErDslParser.g:869:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= Int ) | (enumLiteral_1= Double ) | (enumLiteral_2= Money ) | (enumLiteral_3= String ) | (enumLiteral_4= Boolean ) | (enumLiteral_5= Datetime ) | (enumLiteral_6= File ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalErDslParser.g:875:2: ( ( (enumLiteral_0= Int ) | (enumLiteral_1= Double ) | (enumLiteral_2= Money ) | (enumLiteral_3= String ) | (enumLiteral_4= Boolean ) | (enumLiteral_5= Datetime ) | (enumLiteral_6= File ) ) )
            // InternalErDslParser.g:876:2: ( (enumLiteral_0= Int ) | (enumLiteral_1= Double ) | (enumLiteral_2= Money ) | (enumLiteral_3= String ) | (enumLiteral_4= Boolean ) | (enumLiteral_5= Datetime ) | (enumLiteral_6= File ) )
            {
            // InternalErDslParser.g:876:2: ( (enumLiteral_0= Int ) | (enumLiteral_1= Double ) | (enumLiteral_2= Money ) | (enumLiteral_3= String ) | (enumLiteral_4= Boolean ) | (enumLiteral_5= Datetime ) | (enumLiteral_6= File ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt17=1;
                }
                break;
            case Double:
                {
                alt17=2;
                }
                break;
            case Money:
                {
                alt17=3;
                }
                break;
            case String:
                {
                alt17=4;
                }
                break;
            case Boolean:
                {
                alt17=5;
                }
                break;
            case Datetime:
                {
                alt17=6;
                }
                break;
            case File:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalErDslParser.g:877:3: (enumLiteral_0= Int )
                    {
                    // InternalErDslParser.g:877:3: (enumLiteral_0= Int )
                    // InternalErDslParser.g:878:4: enumLiteral_0= Int
                    {
                    enumLiteral_0=(Token)match(input,Int,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:885:3: (enumLiteral_1= Double )
                    {
                    // InternalErDslParser.g:885:3: (enumLiteral_1= Double )
                    // InternalErDslParser.g:886:4: enumLiteral_1= Double
                    {
                    enumLiteral_1=(Token)match(input,Double,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:893:3: (enumLiteral_2= Money )
                    {
                    // InternalErDslParser.g:893:3: (enumLiteral_2= Money )
                    // InternalErDslParser.g:894:4: enumLiteral_2= Money
                    {
                    enumLiteral_2=(Token)match(input,Money,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:901:3: (enumLiteral_3= String )
                    {
                    // InternalErDslParser.g:901:3: (enumLiteral_3= String )
                    // InternalErDslParser.g:902:4: enumLiteral_3= String
                    {
                    enumLiteral_3=(Token)match(input,String,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalErDslParser.g:909:3: (enumLiteral_4= Boolean )
                    {
                    // InternalErDslParser.g:909:3: (enumLiteral_4= Boolean )
                    // InternalErDslParser.g:910:4: enumLiteral_4= Boolean
                    {
                    enumLiteral_4=(Token)match(input,Boolean,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalErDslParser.g:917:3: (enumLiteral_5= Datetime )
                    {
                    // InternalErDslParser.g:917:3: (enumLiteral_5= Datetime )
                    // InternalErDslParser.g:918:4: enumLiteral_5= Datetime
                    {
                    enumLiteral_5=(Token)match(input,Datetime,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalErDslParser.g:925:3: (enumLiteral_6= File )
                    {
                    // InternalErDslParser.g:925:3: (enumLiteral_6= File )
                    // InternalErDslParser.g:926:4: enumLiteral_6= File
                    {
                    enumLiteral_6=(Token)match(input,File,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000024011200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000058328000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004003C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003C00000L});

}