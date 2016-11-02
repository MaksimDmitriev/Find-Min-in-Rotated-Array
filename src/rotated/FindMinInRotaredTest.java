package rotated;

import org.junit.Assert;
import org.junit.Test;

public class FindMinInRotaredTest {

	@Test
	public void sorted() {
		int[] array = { 1, 2, 3, 4 };
		Assert.assertEquals(0, Main.getMinInRotatedArray(array));
	}

	@Test
	public void last() {
		int[] array = { 1, 2, 3, -1 };
		Assert.assertEquals(3, Main.getMinInRotatedArray(array));
	}

	@Test
	public void mid() {
		int[] array = { 1, 2, -7, -1 };
		Assert.assertEquals(2, Main.getMinInRotatedArray(array));
	}

	@Test
	public void midOdd() {
		int[] array = { 1, 2, -3, -1, 0 };
		Assert.assertEquals(2, Main.getMinInRotatedArray(array));
	}
}
