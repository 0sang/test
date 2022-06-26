package com.test;

import com.test.loadingTest.dto.BoardDto;
import com.test.loadingTest.entity.Board;
import com.test.loadingTest.entity.Member;
import com.test.loadingTest.repository.BoardRepository;
import com.test.loadingTest.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
public class TestApplicationTests {

	@Autowired
	BoardRepository boardRepository;

	@Autowired
	MemberRepository memberRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void 데이터_조회(){
		Member member = new Member(1L, "박병주");
		memberRepository.save(member);

		Board board = new Board(1L, "제목", "내용", member);
		boardRepository.save(board);

		/* given */
		Optional<Board> result = boardRepository.findById(1L);
		/* when */
		Board board1 = result.get();
		/* then */
//		System.out.println(board1.toString());
//		System.out.println(board1.getMember().getName());
		System.out.println(board.getMember().getClass().toString());
//		System.out.println(result.get());
//		System.out.println(result.get().getMember().getName());

	}

}
