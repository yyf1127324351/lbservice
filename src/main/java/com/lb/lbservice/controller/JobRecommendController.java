package com.lb.lbservice.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lb.lbservice.dto.JobRecommendAndInfo;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.model.RecommendDetailModel;
import com.lb.lbservice.service.JobRecommendService;
import com.lb.lbservice.utils.BaseResponse;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 岗位推荐记录controller
 * */

@RestController
@RequestMapping("api/v1/jobRecommend")
public class JobRecommendController {
    private static final Logger logger = Logger.getLogger(JobRecommendController.class);

    @Value("${tokens}")
    private String tokens;

    @Autowired
    private JobRecommendService jobRecommendService;


    /**
     *  新增岗位推荐记录
     * */
    @PostMapping("addJobRecommend")
    public BaseResponse addJobRecommend(@RequestBody JobRecommendModel jobRecommendModel) {
        try {
            return jobRecommendService.insertJobRecommend(jobRecommendModel);
        }catch (Exception e){
            logger.error("api/v1/jobRecommend/addJobRecommend-exception:",e);
            return new BaseResponse().error();
        }
    }

    /**
     *  获取推荐岗位，及推荐详情
     * */
    @PostMapping("getRecommendDetail")
    public BaseResponse getRecommendDetail(@RequestBody RecommendDetailModel recommendDetailModel){
        if (null != recommendDetailModel && null != recommendDetailModel.getJobRecommendInfoId()){
            try {
                RecommendDetailModel model = jobRecommendService.getRecommendDetail(recommendDetailModel);
                return new BaseResponse().success(model);
            }catch (Exception e){
                logger.error("api/v1/jobRecommend/getRecommendDetail-exception:",e);
                return new BaseResponse().error();
            }
        }else {
            return new BaseResponse().paramEerror("参数错误！");
        }


    }
    /**
     *  更新岗位推荐表状态
     * */
    @PostMapping("updateJobRecommend")
    public void updateJobRecommend(@RequestBody JSONObject jsonObject){
        String token = jsonObject.getString("token");
        if (StringUtils.isNotBlank(token)){
            if (token.equals(tokens)){
                JSONArray jsonArray = jsonObject.getJSONArray("data");
                if (CollectionUtils.isNotEmpty(jsonArray)){
                    List<JobRecommendModel> list = JSONObject.parseArray(jsonArray.toJSONString(), JobRecommendModel.class);
                    jobRecommendService.updateJobRecommend(list);
                }
            }
        }
    }


    @RequestMapping("getHrData")
    public List<JobRecommendAndInfo> getHrData(String token)
    {
       if(!token.equals(tokens))
           return  null;
       else
           return jobRecommendService.queryRecommendAndInfo();

    }

}
