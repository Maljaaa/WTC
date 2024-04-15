package christmas.controller;

import christmas.view.input.InputView;
import christmas.view.output.OutputView;

public class ViewController {

    private OutputView outputView;
    private InputView inputView;

    public ViewController() {
        outputView = new OutputView();
        inputView = new InputView();
    }

    public OutputView getOutputView() {
        return outputView;
    }

    public InputView getInputView() {
        return inputView;
    }
}
