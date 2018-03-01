package org.hibernate.bugs.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author mkaletka
 */
@Entity
@DiscriminatorValue("CHILD1")
public class Child1 extends Parent {
}
