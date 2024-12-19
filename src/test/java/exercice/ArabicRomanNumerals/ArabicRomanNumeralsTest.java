package exercice.ArabicRomanNumerals;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ArabicRomanNumeralsTest {

    private ArabicRomanNumerals RomanNumerals;// declaration ela objet RomanNumerals
    @BeforeEach
    void setUp(){RomanNumerals = new ArabicRomanNumerals(); }
    @AfterEach
    void tearDown(){RomanNumerals = null;}

    @Test
    void convert_1_devrait_retourner_chiffre_romains(){
        // GIVEN
        int nb = 1 ;
        // WHEN
        String resultat = RomanNumerals.convert(nb);
        // THEN
        assertThat(resultat).isEqualTo("I");
    }
    @Test
    void convert_3_devrait_retourner_chiffre_romains(){
        // GIVEN
        int nb = 3 ;
        // WHEN
        String resultat = RomanNumerals.convert(nb);
        // THEN
        assertThat(resultat).isEqualTo("III");

    }
    @Test
    void convert_4_devrait_retourner_chiffre_romains(){
        // GIVEN
        int nb = 4 ;
        // WHEN
        String resultat = RomanNumerals.convert(nb);
        // THEN
        assertThat(resultat).isEqualTo("IV");

    }
    @Test
    void convert_10_devrait_retourner_chiffre_romains(){
        // GIVEN
        int nb = 10 ;
        // WHEN
        String resultat = RomanNumerals.convert(nb);
        // THEN
        assertThat(resultat).isEqualTo("X");

    }
    @Test
    void convert_39_devrait_retourner_chiffre_romains(){
        // GIVEN
        int nb = 39 ;
        // WHEN
        String resultat = RomanNumerals.convert(nb);
        // THEN
        assertThat(resultat).isEqualTo("XXXIX");

    }

}
