package org.hibernate.bugs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * @author mkaletka
 */
@Entity
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany
    private List<GrandParent> parents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<GrandParent> getParents() {
        return parents;
    }

    public void setParents(List<GrandParent> parents) {
        this.parents = parents;
    }

}
