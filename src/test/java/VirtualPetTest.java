import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet underTest = new VirtualPet();
	VirtualPet testEeyore = new VirtualEeyore();
	
	
	
	@Test
	public void decreasePetHungerLevelfrom25To10() {
		underTest.feed();
		int hunger = underTest.getHungerLevel();
		assertThat(hunger, is(10));
	}
	
	@Test
	public void decreasePetHungerLevelfrom25To0After2Feeds() {
		underTest.feed();
		underTest.feed();
		int hunger = underTest.getHungerLevel();
		assertThat(hunger, is(0));
	}
	
	@Test
	public void decreasePetThirstLevelfrom25to15WithGiveWater() {
		underTest.giveWater();
		int thirst = underTest.getThirstLevel();
		assertThat(thirst, is(15));
	}
	
	@Test
	public void decreasePetThirstLevelfrom25to5With2GiveWater() {
		underTest.giveWater();
		underTest.giveWater();
		int thirst = underTest.getThirstLevel();
		assertThat(thirst, is(5));
	}
	
	@Test
	public void decreasePetThirstLevelfrom25to0With3GiveWater() {
		underTest.giveWater();
		underTest.giveWater();
		underTest.giveWater();
		int thirst = underTest.getThirstLevel();
		assertThat(thirst, is(0));
	}
	
	@Test
	public void descreasePetBoredomfrom25to15WithPlay() {
		underTest.play();
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(15));
	}

	@Test
	public void descreasePetBoredomfrom25to0With3Play() {
		underTest.play();
		underTest.play();
		underTest.play();
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(0));
	}
	
	@Test
	public void descreasePetSicknessfrom25to5WithTakeToVirtualVet() {
		underTest.takeToVirtualVet();
		int sickness = underTest.getSickness();
		assertThat(sickness, is(5));
	}
	
	@Test
	public void descreasePetSicknessfrom25to0With2TakeToVirtualVet() {
		underTest.takeToVirtualVet();
		underTest.takeToVirtualVet();
		int sickness = underTest.getSickness();
		assertThat(sickness, is(0));
	}
	
	@Test
	public void checkThatAllValuesIncreaseUponTick() {
		underTest.tick();
		int hunger = underTest.getHungerLevel();
		int thirst = underTest.getThirstLevel();
		int boredom = underTest.getBoredom();
		int sickness = underTest.getSickness();

		assertTrue(hunger > 25);
		assertTrue(thirst > 25);
		assertTrue(boredom > 25);
		assertTrue(sickness > 25);
	}
	
	@Test
	public void decreaseEeyoreHungerFrom15To10withFeed() {
		testEeyore.feed();
		int hunger = testEeyore.getHungerLevel();
		assertThat(hunger, is(10));
	}
	
	@Test
	public void decreaseEeyoreBoredomFrom40To33withPlay() {
		testEeyore.play();
		int boredom = testEeyore.getBoredom();
		assertThat(boredom, is(33));
	}
	
	@Test
	public void checkThat1TickPassedInGame() {
		underTest.tick();
		int ticks = underTest.getTicksPassed();
		assertThat(ticks, is(1));
	}
	
	@Test
	public void checkThat2TickPassedInGameForEeyore() {
		testEeyore.tick();
		testEeyore.tick();
		int ticks = testEeyore.getTicksPassed();
		assertThat(ticks, is(2));
	}
	
}
