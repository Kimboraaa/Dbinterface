package org.edu.service;

import java.util.List;

import javax.inject.Inject;

import org.edu.dao.IF_SampleDAO;
import org.edu.vo.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements IF_SampleService {

	@Inject
	private IF_SampleDAO sampleDAO;
	
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sampleDAO.insertMember(vo);
		
	}

	@Override
	public List<MemberVO> selectMember() throws Exception {
		return sampleDAO.selectMember();
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		sampleDAO.updateMember(vo);
		
	}

	@Override
	public void deleteMember(String userid) throws Exception {
		sampleDAO.deleteMember(userid);
		
	}//IF_Sample을 구현했는데 그 구현한 클래스가 sample serviceimpl이다.

}
