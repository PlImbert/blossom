package com.blossomproject.core.common.service;

import com.blossomproject.core.common.dto.AbstractAssociationDTO;
import com.blossomproject.core.common.dto.AbstractDTO;

import java.util.List;

public interface AssociationService<A extends AbstractDTO, B extends AbstractDTO, ASSOCIATION extends AbstractAssociationDTO<A, B>>
extends AssociationServicePlugin{

    ASSOCIATION associate(A a, B b);

    void dissociate(A a, B b);

    void dissociateAllRight(B b);

    void dissociateAllLeft(A a);

    List<ASSOCIATION> getAllRight(B b);

    List<ASSOCIATION> getAllLeft(A a);

    ASSOCIATION getOne(long id);

}
