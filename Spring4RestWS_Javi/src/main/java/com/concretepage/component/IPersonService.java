package com.concretepage.component;

import com.concretepage.test.Persona;

public interface IPersonService {
  public Persona getPersonDetail(Long id);
  public Persona createPersona(String name);
}
