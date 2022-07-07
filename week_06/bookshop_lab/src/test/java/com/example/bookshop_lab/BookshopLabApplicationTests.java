package com.example.bookshop_lab;

import com.example.bookshop_lab.models.Book;
import com.example.bookshop_lab.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BookshopLabApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindSameAuthorInName(){
		List<Book> found = bookRepository.findBookByName("Julia Donaldson");
		assertThat(found.size()).isEqualTo(2);
	}

	@Test
	public void canFindTitleContainingWord(){
		List<Book> found = bookRepository.findByTitleContainingIgnoreCase("the");
		assertThat(found.size()).isEqualTo(3);
	}

}
