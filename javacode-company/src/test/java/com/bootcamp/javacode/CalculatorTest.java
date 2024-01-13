package com.bootcamp.javacode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bootcamp.javacode.model.Calculators;
import com.bootcamp.javacode.model.RealCalculator;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.times;


@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
  
  @Mock
  private Calculators calculator; // new ?

  // @InjectMocks means calling the consturctor "Realculator(Calculator calculator)" 
  // by passing the mock calculator
  @InjectMocks
  private RealCalculator realCalculator;

  @Test
  void testCalculateMethod() {
    
    // when someone call "calculator.addition(10, 5), assume return 3 always.
    Mockito.when(calculator.addition(10,5)).thenReturn(3);
    

    // Call the targeted test method
    RealCalculator realCalculator = new RealCalculator(calculator);
    // actually call calculator.addition(10, 5)
    assertThat(realCalculator.calculate(10), is(17)); // 3 + p + 4 = 17


    Mockito.when(calculator.addition(82,41)).thenReturn(1000);
    assertThat(realCalculator.calculate(82), is(1086)); // 1000 + p + 4 = 1086
    
  }

  @Test
  void testSleep() {
    
    RealCalculator realCalculator = new RealCalculator(calculator);

    Mockito.when(calculator.addition(4, 2)).thenReturn(1);

    assertThat(realCalculator.sleep(4), is(21)); // 1 + 20 = 21

    // Verify How many times & what input parameters passed to call sleep method
    Mockito.verify(calculator,times(1)).addition(4,2);

    Mockito.when(calculator.addition(282, 141)).thenReturn(600);
    assertThat(realCalculator.sleep(282), is(620)); // 600 + 20 = 620
    Mockito.verify(calculator,times(1)).addition(282,141);
    Mockito.verify(calculator,times(0)).addition(20,20);

  }

  @Test
  void testSleep2() {
    Mockito.when(calculator.addition(50,25)).thenReturn(2);
    assertThat(this.realCalculator.sleep(50),is(22)); // 2 + 20
  }
}