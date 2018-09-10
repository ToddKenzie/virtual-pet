package vPets;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import vPets.VirtualEeyore;
import vPets.VirtualPet;

public class VirtualPetTest {

	VirtualPet underTest = new VirtualSimplePet();
	VirtualPet testEeyore = new VirtualEeyore();
	
	
	
	@Test
	public void decreasePetHungerLevelfrom20To10() {
		underTest.feed();
		int hunger = underTest.getHunger();
		assertThat(hunger, is(10));
	}
	
	@Test
	public void decreasePetHungerLevelfrom20To0After0Feeds() {
		underTest.feed();
		underTest.feed();
		int hunger = underTest.getHunger();
		assertThat(hunger, is(0));
	}
	
	@Test
	public void decreasePetThirstLevelfrom20to10WithGiveWater() {
		underTest.giveWater();
		int thirst = underTest.getThirst();
		assertThat(thirst, is(10));
	}
	
	@Test
	public void decreasePetThirstLevelfrom20to0With2GiveWater() {
		underTest.giveWater();
		underTest.giveWater();
		int thirst = underTest.getThirst();
		assertThat(thirst, is(0));
	}
	
	@Test
	public void decreasePetThirstLevelfrom20to0With3GiveWater() {
		underTest.giveWater();
		underTest.giveWater();
		underTest.giveWater();
		int thirst = underTest.getThirst();
		assertThat(thirst, is(0));
	}
	
	@Test
	public void descreasePetBoredomfrom20to10WithPlay() {
		underTest.play();
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(10));
	}

	@Test
	public void descreasePetBoredomfrom20to0With3Play() {
		underTest.play();
		underTest.play();
		underTest.play();
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(0));
	}
	
	@Test
	public void descreasePetSicknessfrom20to0WithTakeToVirtualVet() {
		underTest.takeToVirtualVet();
		int sickness = underTest.getSickness();
		assertThat(sickness, is(0));
	}
	
	@Test
	public void descreasePetSicknessfrom20to0With2TakeToVirtualVet() {
		underTest.takeToVirtualVet();
		underTest.takeToVirtualVet();
		int sickness = underTest.getSickness();
		assertThat(sickness, is(0));
	}
	
	@Test
	public void checkThatAllValuesIncreaseUponTick() {
		underTest.tick("");
		int hunger = underTest.getHunger();
		int thirst = underTest.getThirst();
		int boredom = underTest.getBoredom();
		int sickness = underTest.getSickness();

		assertTrue(hunger > 20);
		assertTrue(thirst > 20);
		assertTrue(boredom > 20);
		assertTrue(sickness > 20);
	}
	
	@Test
	public void decreaseEeyoreHungerFrom15To5withFeed() {
		testEeyore.feed();
		int hunger = testEeyore.getHunger();
		assertThat(hunger, is(5));
	}
	
	@Test
	public void decreaseEeyoreBoredomFrom40To33withPlay() {
		testEeyore.play();
		int boredom = testEeyore.getBoredom();
		assertThat(boredom, is(33));
	}
	
	@Test
	public void checkThat1TickPassedInGame() {
		underTest.tick("");
		int ticks = underTest.getTicksPassed();
		assertThat(ticks, is(1));
	}
	
	@Test
	public void checkThat2TickPassedInGameForEeyore() {
		testEeyore.tick("");
		testEeyore.tick("");
		int ticks = testEeyore.getTicksPassed();
		assertThat(ticks, is(2));
	}
	
	@Test
	public void generateEeyoreFromStore() {
		VPetStore testStore = new VPetStore();
		VirtualPet newPet = testStore.purchasePet("Eeyore");
		assertThat(newPet, instanceOf(VirtualEeyore.class));
	}
	
	@Test
	public void generatePoohFromStore() {
		VPetStore testStore = new VPetStore();
		VirtualPet newPet = testStore.purchasePet("Pooh");
		assertThat(newPet, instanceOf(VirtualPooh.class));
	}
	
}
