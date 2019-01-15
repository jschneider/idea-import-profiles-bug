package com.cedarsoft;

import org.junit.jupiter.api.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class FxTest {
  @Test
  void testFx() throws Exception {
    StringProperty property = new SimpleStringProperty();
    property.set("The value");
  }
}
