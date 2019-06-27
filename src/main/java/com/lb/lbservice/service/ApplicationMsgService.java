package com.lb.lbservice.service;

import com.lb.lbservice.model.ApplicantMsg;
import com.lb.lbservice.utils.BaseResponse;

public interface ApplicationMsgService {
    BaseResponse CreateApplicationMsg(ApplicantMsg input, Long applyId);
}
