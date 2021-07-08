package edu.pdx.cs410J.hsquared;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainNumber7() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "7");
    assertThat(result.getExitCode(), equalTo(0));
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Qix\n"));
  }
  @Test
  void invokingMainNumber4() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4");
    assertThat(result.getExitCode(), equalTo(0));
    assertThat(result.getTextWrittenToStandardOut(), equalTo("4\n"));
  }
  @Test
  void invokingMainNumber3() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "3");
    assertThat(result.getExitCode(), equalTo(0));
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo\n"));
  }
  @Test
  void invokingMainNumber21() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "21");
    assertThat(result.getExitCode(), equalTo(0));
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooQix\n"));
  }
}
