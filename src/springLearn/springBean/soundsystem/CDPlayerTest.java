package springLearn.springBean.soundsystem;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayerTest {
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void test() {
		assertNull(cd);
	}

}
