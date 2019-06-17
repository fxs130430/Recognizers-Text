// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// ------------------------------------------------------------------------------

package com.microsoft.recognizers.text.number.resources;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class SpanishNumeric {

    public static final String LangMarker = "Spa";

    public static final Boolean CompoundNumberLanguage = false;

    public static final Boolean MultiDecimalSeparatorCulture = true;

    public static final String HundredsNumberIntegerRegex = "(cuatrocient[ao]s|trescient[ao]s|seiscient[ao]s|setecient[ao]s|ochocient[ao]s|novecient[ao]s|doscient[ao]s|quinient[ao]s|(?<!por\\s+)(cien(to)?))";

    public static final String RoundNumberIntegerRegex = "(mil millones|mil|millones|mill[oó]n|billones|bill[oó]n|trillones|trill[oó]n|cuatrillones|cuatrill[oó]n|quintillones|quintill[oó]n|sextillones|sextill[oó]n|septillones|septill[oó]n)";

    public static final String ZeroToNineIntegerRegex = "(cuatro|cinco|siete|nueve|cero|tres|seis|ocho|dos|un[ao]?)";

    public static final String TenToNineteenIntegerRegex = "(diecisiete|diecinueve|diecis[eé]is|dieciocho|catorce|quince|trece|diez|once|doce)";

    public static final String TwentiesIntegerRegex = "(veinticuatro|veinticinco|veintisiete|veintinueve|veintitr[eé]s|veintis[eé]is|veintiocho|veintid[oó]s|ventiun[ao]|veinti[uú]n[oa]?|veinte)";

    public static final String TensNumberIntegerRegex = "(cincuenta|cuarenta|treinta|sesenta|setenta|ochenta|noventa)";

    public static final String NegativeNumberTermsRegex = "((?<!(al|lo)\\s+)menos\\s+)";

    public static final String NegativeNumberSignRegex = "^{NegativeNumberTermsRegex}.*"
            .replace("{NegativeNumberTermsRegex}", NegativeNumberTermsRegex);

    public static final String DigitsNumberRegex = "\\d|\\d{1,3}(\\.\\d{3})";

    public static final String BelowHundredsRegex = "(({TenToNineteenIntegerRegex}|{TwentiesIntegerRegex}|({TensNumberIntegerRegex}(\\s+y\\s+{ZeroToNineIntegerRegex})?))|{ZeroToNineIntegerRegex})"
            .replace("{TenToNineteenIntegerRegex}", TenToNineteenIntegerRegex)
            .replace("{TwentiesIntegerRegex}", TwentiesIntegerRegex)
            .replace("{TensNumberIntegerRegex}", TensNumberIntegerRegex)
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex);

    public static final String BelowThousandsRegex = "({HundredsNumberIntegerRegex}(\\s+{BelowHundredsRegex})?|{BelowHundredsRegex})"
            .replace("{HundredsNumberIntegerRegex}", HundredsNumberIntegerRegex)
            .replace("{BelowHundredsRegex}", BelowHundredsRegex);

    public static final String SupportThousandsRegex = "(({BelowThousandsRegex}|{BelowHundredsRegex})\\s+{RoundNumberIntegerRegex}(\\s+{RoundNumberIntegerRegex})?)"
            .replace("{BelowThousandsRegex}", BelowThousandsRegex)
            .replace("{BelowHundredsRegex}", BelowHundredsRegex)
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex);

    public static final String SeparaIntRegex = "({SupportThousandsRegex}(\\s+{SupportThousandsRegex})*(\\s+{BelowThousandsRegex})?|{BelowThousandsRegex})"
            .replace("{SupportThousandsRegex}", SupportThousandsRegex)
            .replace("{BelowThousandsRegex}", BelowThousandsRegex);

    public static final String AllIntRegex = "({SeparaIntRegex}|mil(\\s+{BelowThousandsRegex})?)"
            .replace("{SeparaIntRegex}", SeparaIntRegex)
            .replace("{BelowThousandsRegex}", BelowThousandsRegex);

    public static final String PlaceHolderPureNumber = "\\b";

    public static final String PlaceHolderDefault = "\\D|\\b";

    public static String NumbersWithPlaceHolder(String placeholder) {
        return "(((?<!\\d+\\s*)-\\s*)|(?<=\\b))\\d+(?!([\\.,]\\d+[a-zA-Z]))(?={placeholder})"
			.replace("{placeholder}", placeholder);
    }

    public static final String NumbersWithSuffix = "(((?<=\\W|^)-\\s*)|(?<=\\b))\\d+\\s*{BaseNumbers.NumberMultiplierRegex}(?=\\b)"
            .replace("{BaseNumbers.NumberMultiplierRegex}", BaseNumbers.NumberMultiplierRegex);

    public static final String RoundNumberIntegerRegexWithLocks = "(?<=\\b)({DigitsNumberRegex})+\\s+{RoundNumberIntegerRegex}(?=\\b)"
            .replace("{DigitsNumberRegex}", DigitsNumberRegex)
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex);

    public static final String NumbersWithDozenSuffix = "(((?<=\\W|^)-\\s*)|(?<=\\b))\\d+\\s+docenas?(?=\\b)";

    public static final String AllIntRegexWithLocks = "((?<=\\b){AllIntRegex}(?=\\b))"
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String AllIntRegexWithDozenSuffixLocks = "(?<=\\b)(((media\\s+)?\\s+docena)|({AllIntRegex}\\s+(y|con)\\s+)?({AllIntRegex}\\s+docenas?))(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String SimpleRoundOrdinalRegex = "(mil[eé]simo|millon[eé]sim[oa]|billon[eé]sim[oa]|trillon[eé]sim[oa]|cuatrillon[eé]sim[oa]|quintillon[eé]sim[oa]|sextillon[eé]sim[oa]|septillon[eé]sim[oa])";

    public static final String OneToNineOrdinalRegex = "(primer[oa]?|segund[oa]|tercer[oa]?|cuart[oa]|quint[oa]|sext[oa]|s[eé]ptim[oa]|octav[oa]|noven[oa])";

    public static final String TensOrdinalRegex = "(nonag[eé]sim[oa]|octog[eé]sim[oa]|septuag[eé]sim[oa]|sexag[eé]sim[oa]|quincuag[eé]sim[oa]|cuadrag[eé]sim[oa]|trig[eé]sim[oa]|vig[eé]sim[oa]|d[eé]cim[oa])";

    public static final String HundredOrdinalRegex = "(cent[eé]sim[oa]|ducent[eé]sim[oa]|tricent[eé]sim[oa]|cuadringent[eé]sim[oa]|quingent[eé]sim[oa]|sexcent[eé]sim[oa]|septingent[eé]sim[oa]|octingent[eé]sim[oa]|noningent[eé]sim[oa])";

    public static final String SpecialUnderHundredOrdinalRegex = "(und[eé]cim[oa]|duod[eé]cimo|decimoctav[oa])";

    public static final String UnderHundredOrdinalRegex = "({SpecialUnderHundredOrdinalRegex}|(({TensOrdinalRegex}(\\s)?)?{OneToNineOrdinalRegex})|{TensOrdinalRegex})"
            .replace("{TensOrdinalRegex}", TensOrdinalRegex)
            .replace("{OneToNineOrdinalRegex}", OneToNineOrdinalRegex)
            .replace("{SpecialUnderHundredOrdinalRegex}", SpecialUnderHundredOrdinalRegex);

    public static final String UnderThousandOrdinalRegex = "((({HundredOrdinalRegex}(\\s)?)?{UnderHundredOrdinalRegex})|{HundredOrdinalRegex})"
            .replace("{HundredOrdinalRegex}", HundredOrdinalRegex)
            .replace("{UnderHundredOrdinalRegex}", UnderHundredOrdinalRegex);

    public static final String OverThousandOrdinalRegex = "(({AllIntRegex})([eé]sim[oa]))"
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String ComplexOrdinalRegex = "(({OverThousandOrdinalRegex}(\\s)?)?{UnderThousandOrdinalRegex}|{OverThousandOrdinalRegex})"
            .replace("{OverThousandOrdinalRegex}", OverThousandOrdinalRegex)
            .replace("{UnderThousandOrdinalRegex}", UnderThousandOrdinalRegex);

    public static final String SufixRoundOrdinalRegex = "(({AllIntRegex})({SimpleRoundOrdinalRegex}))"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{SimpleRoundOrdinalRegex}", SimpleRoundOrdinalRegex);

    public static final String ComplexRoundOrdinalRegex = "((({SufixRoundOrdinalRegex}(\\s)?)?{ComplexOrdinalRegex})|{SufixRoundOrdinalRegex})"
            .replace("{SufixRoundOrdinalRegex}", SufixRoundOrdinalRegex)
            .replace("{ComplexOrdinalRegex}", ComplexOrdinalRegex);

    public static final String AllOrdinalRegex = "{ComplexOrdinalRegex}|{SimpleRoundOrdinalRegex}|{ComplexRoundOrdinalRegex}"
            .replace("{ComplexOrdinalRegex}", ComplexOrdinalRegex)
            .replace("{SimpleRoundOrdinalRegex}", SimpleRoundOrdinalRegex)
            .replace("{ComplexRoundOrdinalRegex}", ComplexRoundOrdinalRegex);

    public static final String OrdinalSuffixRegex = "(?<=\\b)(\\d*(1r[oa]|2d[oa]|3r[oa]|4t[oa]|5t[oa]|6t[oa]|7m[oa]|8v[oa]|9n[oa]|0m[oa]|11[vm][oa]|12[vm][oa]))(?=\\b)";

    public static final String OrdinalNounRegex = "(?<=\\b){AllOrdinalRegex}(?=\\b)"
            .replace("{AllOrdinalRegex}", AllOrdinalRegex);

    public static final String SpecialFractionInteger = "((({AllIntRegex})i?({ZeroToNineIntegerRegex})|({AllIntRegex}))a?v[oa]s?)"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex);

    public static final String FractionNotationRegex = "(((?<=\\W|^)-\\s*)|(?<=\\b))\\d+[/]\\d+(?=(\\b[^/]|$))";

    public static final String FractionNotationWithSpacesRegex = "(((?<=\\W|^)-\\s*)|(?<=\\b))\\d+\\s+\\d+[/]\\d+(?=(\\b[^/]|$))";

    public static final String FractionNounRegex = "(?<=\\b)({AllIntRegex}\\s+((y|con)\\s+)?)?({AllIntRegex})(\\s+((y|con)\\s)?)((({AllOrdinalRegex})s?|({SpecialFractionInteger})|({SufixRoundOrdinalRegex})s?)|medi[oa]s?|tercios?)(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{AllOrdinalRegex}", AllOrdinalRegex)
            .replace("{SpecialFractionInteger}", SpecialFractionInteger)
            .replace("{SufixRoundOrdinalRegex}", SufixRoundOrdinalRegex);

    public static final String FractionNounWithArticleRegex = "(?<=\\b)({AllIntRegex}\\s+(y\\s+)?)?(un|un[oa])(\\s+)(({AllOrdinalRegex})|({SufixRoundOrdinalRegex})|(y\\s+)?medi[oa]s?)(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{AllOrdinalRegex}", AllOrdinalRegex)
            .replace("{SufixRoundOrdinalRegex}", SufixRoundOrdinalRegex);

    public static final String FractionPrepositionRegex = "(?<=\\b)(?<numerator>({AllIntRegex})|((?<!\\.)\\d+))\\s+sobre\\s+(?<denominator>({AllIntRegex})|((\\d+)(?!\\.)))(?=\\b)"
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String AllPointRegex = "((\\s+{ZeroToNineIntegerRegex})+|(\\s+{AllIntRegex}))"
            .replace("{ZeroToNineIntegerRegex}", ZeroToNineIntegerRegex)
            .replace("{AllIntRegex}", AllIntRegex);

    public static final String AllFloatRegex = "{AllIntRegex}(\\s+(coma|con)){AllPointRegex}"
            .replace("{AllIntRegex}", AllIntRegex)
            .replace("{AllPointRegex}", AllPointRegex);

    public static String DoubleDecimalPointRegex(String placeholder) {
        return "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+[\\.,])))\\d+[\\.,]\\d+(?!([\\.,]\\d+))(?={placeholder})"
			.replace("{placeholder}", placeholder);
    }

    public static String DoubleWithoutIntegralRegex(String placeholder) {
        return "(?<=\\s|^)(?<!(\\d+))[\\.,]\\d+(?!([\\.,]\\d+))(?={placeholder})"
			.replace("{placeholder}", placeholder);
    }

    public static final String DoubleWithMultiplierRegex = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+\\[\\.,])))\\d+[\\.,]\\d+\\s*{BaseNumbers.NumberMultiplierRegex}(?=\\b)"
            .replace("{BaseNumbers.NumberMultiplierRegex}", BaseNumbers.NumberMultiplierRegex);

    public static final String DoubleWithRoundNumber = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+\\[\\.,])))\\d+[\\.,]\\d+\\s+{RoundNumberIntegerRegex}(?=\\b)"
            .replace("{RoundNumberIntegerRegex}", RoundNumberIntegerRegex);

    public static final String DoubleAllFloatRegex = "((?<=\\b){AllFloatRegex}(?=\\b))"
            .replace("{AllFloatRegex}", AllFloatRegex);

    public static final String DoubleExponentialNotationRegex = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+[\\.,])))(\\d+([\\.,]\\d+)?)e([+-]*[1-9]\\d*)(?=\\b)";

    public static final String DoubleCaretExponentialNotationRegex = "(((?<!\\d+\\s*)-\\s*)|((?<=\\b)(?<!\\d+[\\.,])))(\\d+([\\.,]\\d+)?)\\^([+-]*[1-9]\\d*)(?=\\b)";

    public static final String NumberWithPrefixPercentage = "(?<!%)({BaseNumbers.NumberReplaceToken})(\\s*)(%(?!{BaseNumbers.NumberReplaceToken})|(por ciento|por cien)\\b)"
            .replace("{BaseNumbers.NumberReplaceToken}", BaseNumbers.NumberReplaceToken);

    public static final String TillRegex = "(\\ba\\b|hasta|--|-|—|——|~|–)";

    public static final String MoreRegex = "(más\\s+alt[oa]\\s+que|(m[áa]s|mayor(es)?|por\\s+encima)(\\s+(que|de|del))?|(?<!<|=)>)";

    public static final String LessRegex = "((menos|menor|menores|por\\s+debajo)(\\s+(que|de|del))?|más\\s+baj[oa]\\s+que|(?<!>|=)<)";

    public static final String EqualRegex = "((igual(es)?|equivalente(s)?|equivale|equivalen|son)(\\s+(a|que|de|al|del))?|(?<!<|>)=)";

    public static final String MoreOrEqualPrefix = "((no\\s+{LessRegex})|(por\\s+lo\\s+menos|como\\s+m[íi]nimo|al\\s+menos))"
            .replace("{LessRegex}", LessRegex);

    public static final String MoreOrEqual = "(({MoreRegex}\\s+(o)?\\s+{EqualRegex})|({EqualRegex}\\s+(o|y)\\s+{MoreRegex})|{MoreOrEqualPrefix}(\\s+(o)\\s+{EqualRegex})?|({EqualRegex}\\s+(o)\\s+)?{MoreOrEqualPrefix}|>\\s*=)"
            .replace("{MoreRegex}", MoreRegex)
            .replace("{EqualRegex}", EqualRegex)
            .replace("{LessRegex}", LessRegex)
            .replace("{MoreOrEqualPrefix}", MoreOrEqualPrefix);

    public static final String MoreOrEqualSuffix = "((\\b(y|o)\\b\\s+(m[áa]s|mayor|mayores)((?!\\s+(alt[oa]|baj[oa]|que|de|del))|(\\s+(que|de|del)(?!(\\s*\\d+)))))|como\\s+m[áa]ximo|por\\s+lo\\s+menos|al\\s+menos)";

    public static final String LessOrEqualPrefix = "((no\\s+{MoreRegex})|(como\\s+máximo|como\\s+maximo|como\\s+mucho))"
            .replace("{MoreRegex}", MoreRegex);

    public static final String LessOrEqual = "(({LessRegex}\\s+(o)?\\s+{EqualRegex})|({EqualRegex}\\s+(o)?\\s+{LessRegex})|{LessOrEqualPrefix}(\\s+(o)?\\s+{EqualRegex})?|({EqualRegex}\\s+(o)?\\s+)?{LessOrEqualPrefix}|<\\s*=)"
            .replace("{LessRegex}", LessRegex)
            .replace("{EqualRegex}", EqualRegex)
            .replace("{MoreRegex}", MoreRegex)
            .replace("{LessOrEqualPrefix}", LessOrEqualPrefix);

    public static final String LessOrEqualSuffix = "((\\b(y|o)\\b\\s+(menos|menor|menores)((?!\\s+(alt[oa]|baj[oa]|que|de|del))|(\\s+(que|de|del)(?!(\\s*\\d+)))))|como\\s+m[íi]nimo)";

    public static final String NumberSplitMark = "(?![,.](?!\\d+))";

    public static final String MoreRegexNoNumberSucceed = "((m[áa]s|mayor|mayores)((?!\\s+(que|de|del))|\\s+((que|de|del)(?!(\\s*\\d+))))|(por encima)(?!(\\s*\\d+)))";

    public static final String LessRegexNoNumberSucceed = "((menos|menor|menores)((?!\\s+(que|de|del))|\\s+((que|de|del)(?!(\\s*\\d+))))|(por debajo)(?!(\\s*\\d+)))";

    public static final String EqualRegexNoNumberSucceed = "((igual|iguales|equivalente|equivalentes|equivale|equivalen)((?!\\s+(a|que|de|al|del))|(\\s+(a|que|de|al|del)(?!(\\s*\\d+)))))";

    public static final String OneNumberRangeMoreRegex1 = "({MoreOrEqual}|{MoreRegex})\\s*((el|la|los|las)\\s+)?(?<number1>({NumberSplitMark}.)+)"
            .replace("{MoreOrEqual}", MoreOrEqual)
            .replace("{MoreRegex}", MoreRegex)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String OneNumberRangeMoreRegex2 = "(?<number1>({NumberSplitMark}.)+)\\s*{MoreOrEqualSuffix}"
            .replace("{MoreOrEqualSuffix}", MoreOrEqualSuffix)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String OneNumberRangeMoreSeparateRegex = "({EqualRegex}\\s+(?<number1>({NumberSplitMark}.)+)(\\s+o\\s+){MoreRegexNoNumberSucceed})|({MoreRegex}\\s+(?<number1>({NumberSplitMark}.)+)(\\s+o\\s+){EqualRegexNoNumberSucceed})"
            .replace("{EqualRegex}", EqualRegex)
            .replace("{MoreRegex}", MoreRegex)
            .replace("{EqualRegexNoNumberSucceed}", EqualRegexNoNumberSucceed)
            .replace("{MoreRegexNoNumberSucceed}", MoreRegexNoNumberSucceed)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String OneNumberRangeLessRegex1 = "({LessOrEqual}|{LessRegex})\\s*((el|la|los|las)\\s+)?(?<number2>({NumberSplitMark}.)+)"
            .replace("{LessOrEqual}", LessOrEqual)
            .replace("{LessRegex}", LessRegex)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String OneNumberRangeLessRegex2 = "(?<number2>({NumberSplitMark}.)+)\\s*{LessOrEqualSuffix}"
            .replace("{LessOrEqualSuffix}", LessOrEqualSuffix)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String OneNumberRangeLessSeparateRegex = "({EqualRegex}\\s+(?<number1>({NumberSplitMark}.)+)(\\s+o\\s+){LessRegexNoNumberSucceed})|({LessRegex}\\s+(?<number1>({NumberSplitMark}.)+)(\\s+o\\s+){EqualRegexNoNumberSucceed})"
            .replace("{EqualRegex}", EqualRegex)
            .replace("{LessRegex}", LessRegex)
            .replace("{EqualRegexNoNumberSucceed}", EqualRegexNoNumberSucceed)
            .replace("{LessRegexNoNumberSucceed}", LessRegexNoNumberSucceed)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String OneNumberRangeEqualRegex = "{EqualRegex}\\s*((el|la|los|las)\\s+)?(?<number1>({NumberSplitMark}.)+)"
            .replace("{EqualRegex}", EqualRegex)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String TwoNumberRangeRegex1 = "entre\\s*((el|la|los|las)\\s+)?(?<number1>({NumberSplitMark}.)+)\\s*y\\s*((el|la|los|las)\\s+)?(?<number2>({NumberSplitMark}.)+)"
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String TwoNumberRangeRegex2 = "({OneNumberRangeMoreRegex1}|{OneNumberRangeMoreRegex2})\\s*(\\by\\b|\\be\\b|pero|,)\\s*({OneNumberRangeLessRegex1}|{OneNumberRangeLessRegex2})"
            .replace("{OneNumberRangeMoreRegex1}", OneNumberRangeMoreRegex1)
            .replace("{OneNumberRangeMoreRegex2}", OneNumberRangeMoreRegex2)
            .replace("{OneNumberRangeLessRegex1}", OneNumberRangeLessRegex1)
            .replace("{OneNumberRangeLessRegex2}", OneNumberRangeLessRegex2);

    public static final String TwoNumberRangeRegex3 = "({OneNumberRangeLessRegex1}|{OneNumberRangeLessRegex2})\\s*(\\by\\b|\\be\\b|pero|,)\\s*({OneNumberRangeMoreRegex1}|{OneNumberRangeMoreRegex2})"
            .replace("{OneNumberRangeMoreRegex1}", OneNumberRangeMoreRegex1)
            .replace("{OneNumberRangeMoreRegex2}", OneNumberRangeMoreRegex2)
            .replace("{OneNumberRangeLessRegex1}", OneNumberRangeLessRegex1)
            .replace("{OneNumberRangeLessRegex2}", OneNumberRangeLessRegex2);

    public static final String TwoNumberRangeRegex4 = "((de|desde)\\s+)?((el|la|los|las)\\s+)?(?<number1>({NumberSplitMark}(?!\\b(entre|de|desde|es)\\b).)+)\\s*{TillRegex}\\s*((el|la|los|las)\\s+)?(?<number2>({NumberSplitMark}.)+)"
            .replace("{TillRegex}", TillRegex)
            .replace("{NumberSplitMark}", NumberSplitMark);

    public static final String AmbiguousFractionConnectorsRegex = "(\\b(en|de)\\b)";

    public static final Character DecimalSeparatorChar = ',';

    public static final String FractionMarkerToken = "sobre";

    public static final Character NonDecimalSeparatorChar = '.';

    public static final String HalfADozenText = "seis";

    public static final String WordSeparatorToken = "y";

    public static final List<String> WrittenDecimalSeparatorTexts = Arrays.asList("coma", "con");

    public static final List<String> WrittenGroupSeparatorTexts = Arrays.asList("punto");

    public static final List<String> WrittenIntegerSeparatorTexts = Arrays.asList("y");

    public static final List<String> WrittenFractionSeparatorTexts = Arrays.asList("con");

    public static final String HalfADozenRegex = "media\\s+docena";

    public static final String DigitalNumberRegex = "((?<=\\b)(mil|millones|mill[oó]n|billones|bill[oó]n|trillones|trill[oó]n|docenas?)(?=\\b))|((?<=(\\d|\\b)){BaseNumbers.MultiplierLookupRegex}(?=\\b))"
            .replace("{BaseNumbers.MultiplierLookupRegex}", BaseNumbers.MultiplierLookupRegex);

    public static final ImmutableMap<String, Long> CardinalNumberMap = ImmutableMap.<String, Long>builder()
        .put("cero", 0L)
        .put("un", 1L)
        .put("una", 1L)
        .put("uno", 1L)
        .put("dos", 2L)
        .put("tres", 3L)
        .put("cuatro", 4L)
        .put("cinco", 5L)
        .put("seis", 6L)
        .put("siete", 7L)
        .put("ocho", 8L)
        .put("nueve", 9L)
        .put("diez", 10L)
        .put("once", 11L)
        .put("doce", 12L)
        .put("docena", 12L)
        .put("docenas", 12L)
        .put("trece", 13L)
        .put("catorce", 14L)
        .put("quince", 15L)
        .put("dieciseis", 16L)
        .put("dieciséis", 16L)
        .put("diecisiete", 17L)
        .put("dieciocho", 18L)
        .put("diecinueve", 19L)
        .put("veinte", 20L)
        .put("ventiuna", 21L)
        .put("ventiuno", 21L)
        .put("veintiun", 21L)
        .put("veintiún", 21L)
        .put("veintiuno", 21L)
        .put("veintiuna", 21L)
        .put("veintidos", 22L)
        .put("veintidós", 22L)
        .put("veintitres", 23L)
        .put("veintitrés", 23L)
        .put("veinticuatro", 24L)
        .put("veinticinco", 25L)
        .put("veintiseis", 26L)
        .put("veintiséis", 26L)
        .put("veintisiete", 27L)
        .put("veintiocho", 28L)
        .put("veintinueve", 29L)
        .put("treinta", 30L)
        .put("cuarenta", 40L)
        .put("cincuenta", 50L)
        .put("sesenta", 60L)
        .put("setenta", 70L)
        .put("ochenta", 80L)
        .put("noventa", 90L)
        .put("cien", 100L)
        .put("ciento", 100L)
        .put("doscientas", 200L)
        .put("doscientos", 200L)
        .put("trescientas", 300L)
        .put("trescientos", 300L)
        .put("cuatrocientas", 400L)
        .put("cuatrocientos", 400L)
        .put("quinientas", 500L)
        .put("quinientos", 500L)
        .put("seiscientas", 600L)
        .put("seiscientos", 600L)
        .put("setecientas", 700L)
        .put("setecientos", 700L)
        .put("ochocientas", 800L)
        .put("ochocientos", 800L)
        .put("novecientas", 900L)
        .put("novecientos", 900L)
        .put("mil", 1000L)
        .put("millon", 1000000L)
        .put("millón", 1000000L)
        .put("millones", 1000000L)
        .put("billon", 1000000000000L)
        .put("billón", 1000000000000L)
        .put("billones", 1000000000000L)
        .put("trillon", 1000000000000000000L)
        .put("trillón", 1000000000000000000L)
        .put("trillones", 1000000000000000000L)
        .build();

    public static final ImmutableMap<String, Long> OrdinalNumberMap = ImmutableMap.<String, Long>builder()
        .put("primero", 1L)
        .put("primera", 1L)
        .put("primer", 1L)
        .put("segundo", 2L)
        .put("segunda", 2L)
        .put("medio", 2L)
        .put("media", 2L)
        .put("tercero", 3L)
        .put("tercera", 3L)
        .put("tercer", 3L)
        .put("tercio", 3L)
        .put("cuarto", 4L)
        .put("cuarta", 4L)
        .put("quinto", 5L)
        .put("quinta", 5L)
        .put("sexto", 6L)
        .put("sexta", 6L)
        .put("septimo", 7L)
        .put("septima", 7L)
        .put("octavo", 8L)
        .put("octava", 8L)
        .put("noveno", 9L)
        .put("novena", 9L)
        .put("decimo", 10L)
        .put("décimo", 10L)
        .put("decima", 10L)
        .put("décima", 10L)
        .put("undecimo", 11L)
        .put("undecima", 11L)
        .put("duodecimo", 12L)
        .put("duodecima", 12L)
        .put("decimotercero", 13L)
        .put("decimotercera", 13L)
        .put("decimocuarto", 14L)
        .put("decimocuarta", 14L)
        .put("decimoquinto", 15L)
        .put("decimoquinta", 15L)
        .put("decimosexto", 16L)
        .put("decimosexta", 16L)
        .put("decimoseptimo", 17L)
        .put("decimoseptima", 17L)
        .put("decimoctavo", 18L)
        .put("decimoctava", 18L)
        .put("decimonoveno", 19L)
        .put("decimonovena", 19L)
        .put("vigesimo", 20L)
        .put("vigesima", 20L)
        .put("trigesimo", 30L)
        .put("trigesima", 30L)
        .put("cuadragesimo", 40L)
        .put("cuadragesima", 40L)
        .put("quincuagesimo", 50L)
        .put("quincuagesima", 50L)
        .put("sexagesimo", 60L)
        .put("sexagesima", 60L)
        .put("septuagesimo", 70L)
        .put("septuagesima", 70L)
        .put("octogesimo", 80L)
        .put("octogesima", 80L)
        .put("nonagesimo", 90L)
        .put("nonagesima", 90L)
        .put("centesimo", 100L)
        .put("centesima", 100L)
        .put("ducentesimo", 200L)
        .put("ducentesima", 200L)
        .put("tricentesimo", 300L)
        .put("tricentesima", 300L)
        .put("cuadringentesimo", 400L)
        .put("cuadringentesima", 400L)
        .put("quingentesimo", 500L)
        .put("quingentesima", 500L)
        .put("sexcentesimo", 600L)
        .put("sexcentesima", 600L)
        .put("septingentesimo", 700L)
        .put("septingentesima", 700L)
        .put("octingentesimo", 800L)
        .put("octingentesima", 800L)
        .put("noningentesimo", 900L)
        .put("noningentesima", 900L)
        .put("milesimo", 1000L)
        .put("milesima", 1000L)
        .put("millonesimo", 1000000L)
        .put("millonesima", 1000000L)
        .put("billonesimo", 1000000000000L)
        .put("billonesima", 1000000000000L)
        .build();

    public static final ImmutableMap<String, Long> PrefixCardinalMap = ImmutableMap.<String, Long>builder()
        .put("dos", 2L)
        .put("tres", 3L)
        .put("cuatro", 4L)
        .put("cinco", 5L)
        .put("seis", 6L)
        .put("siete", 7L)
        .put("ocho", 8L)
        .put("nueve", 9L)
        .put("diez", 10L)
        .put("once", 11L)
        .put("doce", 12L)
        .put("trece", 13L)
        .put("catorce", 14L)
        .put("quince", 15L)
        .put("dieciseis", 16L)
        .put("dieciséis", 16L)
        .put("diecisiete", 17L)
        .put("dieciocho", 18L)
        .put("diecinueve", 19L)
        .put("veinte", 20L)
        .put("ventiuna", 21L)
        .put("veintiun", 21L)
        .put("veintiún", 21L)
        .put("veintidos", 22L)
        .put("veintitres", 23L)
        .put("veinticuatro", 24L)
        .put("veinticinco", 25L)
        .put("veintiseis", 26L)
        .put("veintisiete", 27L)
        .put("veintiocho", 28L)
        .put("veintinueve", 29L)
        .put("treinta", 30L)
        .put("cuarenta", 40L)
        .put("cincuenta", 50L)
        .put("sesenta", 60L)
        .put("setenta", 70L)
        .put("ochenta", 80L)
        .put("noventa", 90L)
        .put("cien", 100L)
        .put("doscientos", 200L)
        .put("trescientos", 300L)
        .put("cuatrocientos", 400L)
        .put("quinientos", 500L)
        .put("seiscientos", 600L)
        .put("setecientos", 700L)
        .put("ochocientos", 800L)
        .put("novecientos", 900L)
        .build();

    public static final ImmutableMap<String, Long> SuffixOrdinalMap = ImmutableMap.<String, Long>builder()
        .put("milesimo", 1000L)
        .put("millonesimo", 1000000L)
        .put("billonesimo", 1000000000000L)
        .build();

    public static final ImmutableMap<String, Long> RoundNumberMap = ImmutableMap.<String, Long>builder()
        .put("mil", 1000L)
        .put("milesimo", 1000L)
        .put("millon", 1000000L)
        .put("millón", 1000000L)
        .put("millones", 1000000L)
        .put("millonesimo", 1000000L)
        .put("billon", 1000000000000L)
        .put("billón", 1000000000000L)
        .put("billones", 1000000000000L)
        .put("billonesimo", 1000000000000L)
        .put("trillon", 1000000000000000000L)
        .put("trillón", 1000000000000000000L)
        .put("trillones", 1000000000000000000L)
        .put("trillonesimo", 1000000000000000000L)
        .put("docena", 12L)
        .put("docenas", 12L)
        .put("k", 1000L)
        .put("m", 1000000L)
        .put("g", 1000000000L)
        .put("b", 1000000000L)
        .put("t", 1000000000000L)
        .build();

    public static final ImmutableMap<String, String> RelativeReferenceOffsetMap = ImmutableMap.<String, String>builder()
        .put("", "")
        .build();

    public static final ImmutableMap<String, String> RelativeReferenceRelativeToMap = ImmutableMap.<String, String>builder()
        .put("", "")
        .build();
}
