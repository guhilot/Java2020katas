package edu.pdx.cs410J.VikramAndTeam;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KataTest
{
//  @Test
//  public void canInstantiateKataClass()
//  {
//    new Kata();
//  }

  @Test
  public void romanNumeralsfor1is1(){
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void romanNumeralsfor5isV(){
    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void romanNumeralsfor10isX(){
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumeralsfor50isL(){
    assertThat(Kata.romanNumeralFor(50), equalTo("L"));
  }

  @Test
  public void romanNumeralsfor100isC(){
    assertThat(Kata.romanNumeralFor(100), equalTo("C"));
  }

  @Test
  public void romanNumeralsfor500isD(){
    assertThat(Kata.romanNumeralFor(500), equalTo("D"));
  }

  @Test
  public void romanNumeralsfor1000isM(){
    assertThat(Kata.romanNumeralFor(1000), equalTo("M"));
  }

  @Test
  public void romanNumeralsfor7isVII(){
    assertThat(Kata.romanNumeralFor(7), equalTo("VII"));
  }

  @Test
  public void romanNumeralsfor4isIV(){
    assertThat(Kata.romanNumeralFor(4), equalTo("IV"));
  }
}
