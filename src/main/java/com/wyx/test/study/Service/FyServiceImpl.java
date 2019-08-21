package com.wyx.test.study.Service;

import com.wyx.test.study.Dao.FyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FyServiceImpl implements FyService {

    @Autowired
    private FyRepository fyRepository;

    @Override
    public Map<String, Object> getFyInfo() {
        return fyRepository.getFyInfo();
    }
}
