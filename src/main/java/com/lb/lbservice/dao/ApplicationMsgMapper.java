package com.lb.lbservice.dao;

import com.lb.lbservice.model.ApplicantMsg;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationMsgMapper {
   void  saveApplicantMsg(ApplicantMsg applicantMsg);
}
