package com.tiedros.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.tiedros.data.api.TodoService;
import com.tiedros.data.stub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Tiedros");
		assertEquals(2, todos.size());
	}
	
}