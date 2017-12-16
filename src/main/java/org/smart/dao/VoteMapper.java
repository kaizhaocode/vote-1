package org.smart.dao;


import java.util.HashMap;
import java.util.List;

import org.smart.domain.Option;
import org.smart.domain.Title;

/**
 * @Author: LAL
 * @Description:
 * @Date Created on 2017/12/15.
 */
public interface VoteMapper {
    List<Title> listTitles();

	List<Option> getOptionsByTid(Integer tid);

	void updateVoteResultById(Integer id);

	void deleteAllOptionsByTid(Integer tid);

	void updateOption(HashMap<String,Object> items);

	void deleteTitleById(Integer id);

	Integer addTitle(Title title);

	List<Title> findTitleByName(String titleName);
}
