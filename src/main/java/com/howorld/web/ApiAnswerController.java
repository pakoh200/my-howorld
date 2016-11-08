package com.howorld.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howorld.domain.Answer;
import com.howorld.domain.AnswerRepository;
import com.howorld.domain.Question;
import com.howorld.domain.QuestionRepository;
import com.howorld.domain.Result;
import com.howorld.domain.User;

@RestController
@RequestMapping("/api/questions/{questionId}/answers")
public class ApiAnswerController {
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@PostMapping("")
	public Answer create(@PathVariable Long questionId, String contents, HttpSession session){
		if(!HttpSessionUtils.isLoginUser(session)){
			return null;
		}
		
		User loginUser = HttpSessionUtils.getUserFromSession(session);
		Question question = questionRepository.findOne(questionId);
		Answer answer = new Answer(loginUser, question, contents);
		return answerRepository.save(answer);
	}
	
	@DeleteMapping("/{id}")
	public Result delete(@PathVariable Long questionId, @PathVariable Long id, HttpSession session){
		if(!HttpSessionUtils.isLoginUser(session)){
			return Result.fail("로그인해야 합니다.");
		}
		
		Answer answer = answerRepository.findOne(id);
		User loginUser = HttpSessionUtils.getUserFromSession(session);
		if(!answer.isSameWriter(loginUser)){
			return Result.fail("자신의 글만 삭제할 수 있습니다.");
		}
		
		answerRepository.delete(id);
		return Result.ok();
	}
}
