package com.company.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.entity.DlStudentEntity;

/**
 * 
 *
 * @author wenbin
 * @email *****@mail.com
 * @date 2020-12-04 18:03:47
 */
public interface DlStudentService extends IService<DlStudentEntity> {
    Integer getClassTypeByStudentId(String studentId);
}

