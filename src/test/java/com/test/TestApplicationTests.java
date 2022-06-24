package com.test;

import com.test.loadingTest.dto.BoardDto;
import com.test.loadingTest.entity.Board;
import com.test.loadingTest.entity.Member;
import com.test.loadingTest.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
public class TestApplicationTests {

	@Autowired
	BoardRepository boardRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void 데이터_조회(){
		Member member = new Member(1L, "박병주");


//		BoardDto dto = BoardDto.builder()
//				.id(1L)
//				.title("title")
//				.content("content")
//				.member(member)
//				.build();

		Board board = new Board(1L, "제목", "내용", member);

		/* given */
		Optional<Board> result = boardRepository.findById(1L);
		/* when */
		Board board1 = result.get();
		/* then */
		System.out.println(board1);
	}

}
