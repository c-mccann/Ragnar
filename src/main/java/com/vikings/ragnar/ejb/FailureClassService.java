package com.vikings.ragnar.ejb;

import com.vikings.ragnar.entities.FailureClassEntity;

import javax.ejb.Local;
import java.util.Collection;

/**
 * Created by carlmccann2 on 17/02/2017.
 */
@Local
public interface FailureClassService {
    Collection<FailureClassEntity> getAllInfo();
    void addFailureClass(FailureClassEntity failureClass);
    void remove(int id);
    void update(FailureClassEntity failureClass);
}
