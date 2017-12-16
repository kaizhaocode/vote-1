package org.smart.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.smart.dao.VoteMapper;
import org.smart.domain.Option;
import org.smart.domain.Title;
import org.smart.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VoteController {
	
	@Autowired
	private VoteService voteService;
	
	// 获取数据 到主页面
    @RequestMapping("/main.do")
    public String list(Model model){
    	List<Title> titles = voteService.listTitles();
    	model.addAttribute("titles", titles);
        return "list";
    }
    
    // 显示投票结果
    @RequestMapping("/showResult.do")
    public String showResult(Integer tid,Model model){
    	List<Option> options = voteService.getOptionsByTid(tid);
    	model.addAttribute("options", options);
        return "showresult";
    }	
    
    // 跳转到添加投票页面
    @RequestMapping("/toAddTitleUI.do")
    public String toAddTitleUI(){
        return "add_title";
    }
    
    // 添加投票标题
    @RequestMapping("/addTitle.do")
    public String addTitle(String titleName,HttpServletRequest request){
    	Title title = new Title();
    	title.setName(titleName);
    	voteService.addTitle(title);
    	
    	Integer tid = title.getId();
    	request.setAttribute("tid", tid);
    	return "add_option";
    }

    
    // 添加选项
    @RequestMapping("/addOption.do")
    public String addOption(String[] option,Integer tid){
    	voteService.updateOption(option, tid);
        return "redirect:/main.do";
    }
    
    // 跳转到投票页面
    @RequestMapping("/toVoteUI.do")
    public String toVoteUI(Integer tid,Model model){
        List<Option> options = voteService.getOptionsByTid(tid);
    	model.addAttribute("options", options);
        return "vote";
    }
    
    // 投票
    @RequestMapping("/vote.do")
    public String vote(Integer id){
    	voteService.updateVoteResultById(id);
        return "redirect:/main.do";
    }
    
    // 跳转到编辑页面
    @RequestMapping("/toEditUI.do")
    public String toEditUI(Integer tid,Model model){
    	List<Option> options = voteService.getOptionsByTid(tid);
    	model.addAttribute("options", options);
    	model.addAttribute("tid", tid);
        return "edit_option";
    }
    
    // 编辑选项
    @RequestMapping("/editOption.do")
    public String editOption(String[] option,Integer tid) {
    	voteService.updateOption(option,tid);
    	return "redirect:/main.do";
    }
    
    // 删除问卷
    @RequestMapping("/deleteTitle.do")
    public String deleteTitle(Integer id) {
    	voteService.deleteTitleById(id);
    	return "redirect:/main.do";
    }
    
    //查询标题
    @RequestMapping("/findTitle.do")
    public String findTitleByName(String titleName,Model model) {
    	List<Title> titles = voteService.findTitleByName(titleName);
    	model.addAttribute("titles", titles);
    	// 查询条件回显
    	model.addAttribute("condition", titleName);
    	return "list";
    }
    
}
