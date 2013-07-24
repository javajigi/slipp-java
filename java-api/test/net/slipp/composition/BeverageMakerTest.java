package net.slipp.composition;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class BeverageMakerTest extends TestCase {
	public void test카페라테() throws Exception {
		MakeRule makeRule = new Coffee();
		List<CondimentRule> condimentRules = Arrays.asList(new MilkCondiment(), new SugarCondiment());
		BeverageMaker beverageMaker = new BeverageMaker(makeRule, condimentRules);
		beverageMaker.prepareRecipe();
	}
	
	public void test레몬차() throws Exception {
		MakeRule makeRule = new Tea();
		List<CondimentRule> condimentRules = Arrays.asList(new LemonCondiment(), new SugarCondiment());
		BeverageMaker beverageMaker = new BeverageMaker(makeRule, condimentRules);
		beverageMaker.prepareRecipe();
	}
}
