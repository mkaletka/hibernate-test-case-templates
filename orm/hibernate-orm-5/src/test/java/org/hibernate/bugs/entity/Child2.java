package org.hibernate.bugs.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author mkaletka
 */
@Entity
@DiscriminatorValue("CHILD2")
public class Child2 extends Parent {
}
