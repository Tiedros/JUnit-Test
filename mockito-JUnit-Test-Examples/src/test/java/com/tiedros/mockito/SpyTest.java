package com.tiedros.mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void creatingASpyOnArrayList() {
		List<String> listSpy = spy(ArrayList.class);
		listSpy.add("Tiedros");
		listSpy.add("Tiedros Abrha");

		verify(listSpy).add("Tiedros");
		verify(listSpy).add("Tiedros Abrha");

		assertEquals(2, listSpy.size());
		assertEquals("Tiedros", listSpy.get(0));
	}

	@Test
	public void creatingASpyOnArrayList_overridingSpecificMethods() {
		List<String> listSpy = spy(ArrayList.class);
		listSpy.add("Tiedros");
		listSpy.add("Tiedros");

		//stub(listSpy.size()).toReturn(-1);
		when(listSpy.size()).thenReturn(-1);

		assertEquals(-1, listSpy.size());
		assertEquals("Tiedros", listSpy.get(0));

		// @Spy Annotation
	}

}