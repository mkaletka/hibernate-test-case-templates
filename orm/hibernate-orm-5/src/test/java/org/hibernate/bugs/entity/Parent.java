package org.hibernate.bugs.entity;

import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import java.util.List;

/**
 * @author mkaletka
 */
@MappedSuperclass
public abstract class Parent extends GrandParent {

    @ManyToMany(mappedBy = "parents")
    private List<TestEntity> entities;

    public List<TestEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<TestEntity> entities) {
        this.entities = entities;
    }

}
