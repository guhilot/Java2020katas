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

}
