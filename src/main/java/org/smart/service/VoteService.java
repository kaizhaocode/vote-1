package org.smart.service;

import java.util.HashMap;
import java.util.List;

import org.smart.dao.VoteMapper;
import org.smart.domain.Option;
import org.smart.domain.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service 层
 * @author m1563
 *
 */
@Service
public class VoteService {
	
	@Autowired
	private VoteMapper voteMapper;
	
	/**
	 * 给出所有的投票名称
	 * @return
	 */
	public List<Title> listTitles(){
		return voteMapper.listTitles();
	}

	/**
	 * 获得投票结果
	 * @param id
	 * @return
	 */
	public List<Option> getOptionsByTid(Integer tid) {
		return voteMapper.getOptionsByTid(tid);
	}

	public void updateVoteResultById(Integer id) {
		voteMapper.updateVoteResultById(id);
	}


	public void updateOption(String[] option, Integer tid) {
		// 先删除原有的选项
		voteMapper.deleteAllOptionsByTid(tid);
		// 再添加新的选项
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("tid", tid);
		map.put("option", option);
		voteMapper.updateOption(map);
	}

	public void deleteTitleById(Integer id) {
		voteMapper.deleteTitleById(id);
		voteMapper.deleteAllOptionsByTid(id);
	}

	public Integer addTitle(Title title) {

		return voteMapper.addTitle(title);
	}

	public List<Title> findTitleByName(String titleName) {
		return voteMapper.findTitleByName(titleName);
	}
	
}
