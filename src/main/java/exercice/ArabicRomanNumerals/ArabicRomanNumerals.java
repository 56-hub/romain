package exercice.ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public static String convert(int nb) {
        if (nb <= 0 || nb > 50) {
            return ""; // Retourne une chaîne vide pour les valeurs hors plage
        }

        switch (nb) {
            case 1:  return "I";
            case 2:  return "II";
            case 3:  return "III";
            case 4:  return "IV";
            case 5:  return "V";
            case 6:  return "VI";
            case 7:  return "VII";
            case 8:  return "VIII";
            case 9:  return "IX";
            case 10: return "X";
            case 11: return "XI";
            case 12: return "XII";
            case 13: return "XIII";
            case 14: return "XIV";
            case 15: return "XV";
            case 16: return "XVI";
            case 17: return "XVII";
            case 18: return "XVIII";
            case 19: return "XIX";
            case 20: return "XX";
            case 21: return "XXI";
            case 22: return "XXII";
            case 23: return "XXIII";
            case 24: return "XXIV";
            case 25: return "XXV";
            case 26: return "XXVI";
            case 27: return "XXVII";
            case 28: return "XXVIII";
            case 29: return "XXIX";
            case 30: return "XXX";
            case 31: return "XXXI";
            case 32: return "XXXII";
            case 33: return "XXXIII";
            case 34: return "XXXIV";
            case 35: return "XXXV";
            case 36: return "XXXVI";
            case 37: return "XXXVII";
            case 38: return "XXXVIII";
            case 39: return "XXXIX";
            case 40: return "XL";
            case 41: return "XLI";
            case 42: return "XLII";
            case 43: return "XLIII";
            case 44: return "XLIV";
            case 45: return "XLV";
            case 46: return "XLVI";
            case 47: return "XLVII";
            case 48: return "XLVIII";
            case 49: return "XLIX";
            case 50: return "L";
            default: return ""; // Cas par defaut pour eviter les erreurs
        }
    }
}
