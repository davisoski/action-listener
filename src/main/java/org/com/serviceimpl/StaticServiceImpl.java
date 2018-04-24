package org.com.serviceimpl;

import org.com.model.StaticModel;
import org.com.service.StaticService;
import org.springframework.stereotype.Service;

@Service("staticService")
public class StaticServiceImpl implements StaticService {

	@Override
	public int getSum(StaticModel staticModel) {
		return staticModel.getValue1() + staticModel.getValue2() + staticModel.getValue3();
	}

}
