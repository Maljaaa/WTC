package christmas.service;

import christmas.model.menu.appetizer.CaesarSalad;
import christmas.model.menu.appetizer.MushroomSoup;
import christmas.model.menu.appetizer.Tapas;
import christmas.model.menu.beverage.Champagne;
import christmas.model.menu.beverage.CokeZero;
import christmas.model.menu.beverage.RedWine;
import christmas.model.menu.desert.ChocoCake;
import christmas.model.menu.desert.Icecream;
import christmas.model.menu.main.BarbecuedRibs;
import christmas.model.menu.main.ChristmasPasta;
import christmas.model.menu.main.SeafoodPasta;
import christmas.model.menu.main.TBoneSteak;

import java.util.List;
import java.util.stream.IntStream;

import static christmas.model.menu.MenuName.*;

public class OrderService {

    public void orderMenu(List<String> menu, List<Integer> menuCount) {
        IntStream.range(0, menu.size())
                .forEach(i -> IntStream.range(0, menuCount.get(i))
                        .forEach(j -> checkOrder(menu.get(i))));
    }

    private void checkOrder(String food) {
        orderCaesarSalad(food);
        orderMushroomSoup(food);
        orderTapas(food);
        orderChampagne(food);
        orderCokeZero(food);
        orderRedWine(food);
        orderChocoCake(food);
        orderIcecream(food);
        orderBarbecuedRibs(food);
        orderChristmasPasta(food);
        orderSeafoodPasta(food);
        orderTBoneSteak(food);
    }

    private void orderTBoneSteak(String food) {
        if (food.equals(T_BONE_STEAK.getMenu())) {
            new TBoneSteak();
        }
    }

    private void orderSeafoodPasta(String food) {
        if (food.equals(SEAFOOD_PASTA.getMenu())) {
            new SeafoodPasta();
        }
    }

    private void orderChristmasPasta(String food) {
        if (food.equals(CHRISTMAS_PASTA.getMenu())) {
            new ChristmasPasta();
        }
    }

    private void orderBarbecuedRibs(String food) {
        if (food.equals(BARBECUED_RIBS.getMenu())) {
            new BarbecuedRibs();
        }
    }

    private void orderIcecream(String food) {
        if (food.equals(ICECREAM.getMenu())) {
            new Icecream();
        }
    }

    private void orderChocoCake(String food) {
        if (food.equals(CHOCO_CAKE.getMenu())) {
            new ChocoCake();
        }
    }

    private void orderRedWine(String food) {
        if (food.equals(RED_WINE.getMenu())) {
            new RedWine();
        }
    }

    private void orderCokeZero(String food) {
        if (food.equals(COKE_ZERO.getMenu())) {
            new CokeZero();
        }
    }

    private void orderChampagne(String food) {
        if (food.equals(CHAMPAGNE.getMenu())) {
            new Champagne();
        }
    }

    private void orderTapas(String food) {
        if (food.equals(TAPAS.getMenu())) {
            new Tapas();
        }
    }

    private void orderMushroomSoup(String food) {
        if (food.equals(MUSHROOM_SOUP.getMenu())) {
            new MushroomSoup();
        }
    }

    private void orderCaesarSalad(String food) {
        if (food.equals(CAESAR_SALAD.getMenu())) {
            new CaesarSalad();
        }
    }
}
