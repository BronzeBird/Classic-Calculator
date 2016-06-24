package com.blogspot.bronzebird.classiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    // Constants
    private final int DISPLAY_MEMORY = 0;
    private final int DISPLAY_MINUS = 1;
    private final int DISPLAY_TEN_MILLION = 2;
    private final int DISPLAY_MILLION = 3;
    private final int DISPLAY_HUNDRED_THOUSAND = 4;
    private final int DISPLAY_TEN_THOUSAND = 5;
    private final int DISPLAY_THOUSAND = 6;
    private final int DISPLAY_HUNDRED = 7;
    private final int DISPLAY_TEN = 8;
    private final int DISPLAY_ONE = 9;

    //   MainActivity sends an input value to an instance of this class,
    //   send ths result, and show it on this app.
    private CalculatorUnit calUnit;

    private ImageView[] ivDisplay;
    private Button btnMc, btnMr, btnMm, btnMp, btnClear, btnPosinega, btnPercent, btnDivide;
    private Button btnSeven, btnEight, btnNine, btnMultiply, btnFour, btnFive, btnSix, btnSubtract;
    private Button btnOne, btnTwo, btnThree, btnAdd, btnZero, btnPoint, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calUnit = new CalculatorUnit();

        // Connect declared variables to objects.
        ivDisplay = new ImageView[10];
        ivDisplay[DISPLAY_MEMORY] = (ImageView)findViewById(R.id.ivResultMem);
        ivDisplay[DISPLAY_MINUS] = (ImageView)findViewById(R.id.ivResultMinus);
        ivDisplay[DISPLAY_TEN_MILLION] = (ImageView)findViewById(R.id.ivResult00);
        ivDisplay[DISPLAY_MILLION] = (ImageView)findViewById(R.id.ivResult01);
        ivDisplay[DISPLAY_HUNDRED_THOUSAND] = (ImageView)findViewById(R.id.ivResult02);
        ivDisplay[DISPLAY_TEN_THOUSAND] = (ImageView)findViewById(R.id.ivResult03);
        ivDisplay[DISPLAY_THOUSAND] = (ImageView)findViewById(R.id.ivResult04);
        ivDisplay[DISPLAY_HUNDRED] = (ImageView)findViewById(R.id.ivResult05);
        ivDisplay[DISPLAY_TEN] = (ImageView)findViewById(R.id.ivResult06);
        ivDisplay[DISPLAY_ONE] = (ImageView)findViewById(R.id.ivResult07);
        btnMc = (Button)findViewById(R.id.btnMc);
        btnMr = (Button)findViewById(R.id.btnMr);
        btnMm = (Button)findViewById(R.id.btnMm);
        btnMp = (Button)findViewById(R.id.btnMp);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnPosinega = (Button)findViewById(R.id.btnPosinega);
        btnPercent = (Button)findViewById(R.id.btnPercent);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnEight = (Button)findViewById(R.id.btnEight);
        btnNine = (Button)findViewById(R.id.btnNine);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnFour = (Button)findViewById(R.id.btnFour);
        btnFive = (Button)findViewById(R.id.btnFive);
        btnSix = (Button)findViewById(R.id.btnSix);
        btnSubtract = (Button)findViewById(R.id.btnSubtract);
        btnOne = (Button)findViewById(R.id.btnOne);
        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnThree = (Button)findViewById(R.id.btnThree);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnZero = (Button)findViewById(R.id.btnZero);
        btnPoint = (Button)findViewById(R.id.btnPoint);
        btnEqual = (Button)findViewById(R.id.btnEqual);

        // Memory and Minus are static ImageView
        ivDisplay[DISPLAY_MEMORY].setImageResource(R.drawable.m);
        ivDisplay[DISPLAY_MINUS].setImageResource(R.drawable.minus);

        // Initialize result window
        updateDisplay();

        // Set listeners.
        btnMc.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('M');
                updateDisplay();
            }
        });

        btnMr.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('R');
                updateDisplay();
            }
        });

        btnMm.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('N');
                updateDisplay();
            }
        });

        btnMp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('P');
                updateDisplay();
            }
        });

        btnClear.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('C');
                updateDisplay();
            }
        });

        btnPosinega.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('~');
                updateDisplay();
            }
        });

        btnPercent.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('%');
                updateDisplay();
            }
        });

        btnDivide.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('/');
                updateDisplay();
            }
        });

        btnSeven.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('7');
                updateDisplay();
            }
        });

        btnEight.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('8');
                updateDisplay();
            }
        });

        btnNine.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('9');
                updateDisplay();
            }
        });

        btnMultiply.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('*');
                updateDisplay();
            }
        });

        btnFour.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('4');
                updateDisplay();
            }
        });

        btnFive.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('5');
                updateDisplay();
            }
        });

        btnSix.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('6');
                updateDisplay();
            }
        });

        btnSubtract.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('-');
                updateDisplay();
            }
        });

        btnOne.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('1');
                updateDisplay();
            }
        });

        btnTwo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('2');
                updateDisplay();
            }
        });

        btnThree.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('3');
                updateDisplay();
            }
        });

        btnAdd.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('+');
                updateDisplay();
            }
        });

        btnZero.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('0');
                updateDisplay();
            }
        });

        btnPoint.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('.');
                updateDisplay();
            }
        });

        btnEqual.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calUnit.processInputValue('=');
                updateDisplay();
            }
        });
    }

    private void updateDisplay() {
        ivDisplay[DISPLAY_MEMORY].setVisibility(
                calUnit.getMemoryDisplay() ? View.VISIBLE : View.INVISIBLE
        );
        ivDisplay[DISPLAY_MINUS].setVisibility(
                calUnit.getPositive() ? View.INVISIBLE : View.VISIBLE
        );

        for(int i = 0; i < 8; i++) {
            switch(calUnit.getValueDisplay()[i].getValue()) {
                case '0':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.zero_dp : R.drawable.zero);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '1':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.one_dp : R.drawable.one);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '2':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.two_dp : R.drawable.two);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '3':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.three_dp : R.drawable.three);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '4':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.four_dp : R.drawable.four);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '5':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.five_dp : R.drawable.five);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '6':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.six_dp : R.drawable.six);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '7':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.seven_dp : R.drawable.seven);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '8':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.eight_dp : R.drawable.eight);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case '9':
                    ivDisplay[i + 2].setImageResource(
                            calUnit.getValueDisplay()[i].getPoint()
                                    ? R.drawable.nine_dp : R.drawable.nine);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                case 'E':
                    ivDisplay[i + 2].setImageResource( R.drawable.m);
                    ivDisplay[i + 2].setVisibility(View.VISIBLE);
                    break;
                default:
                    ivDisplay[i + 2].setVisibility(View.INVISIBLE);
                    break;
            }
        }
    }
}

class SevenSegment {
    // A boolean array with size 7 is more economic than an integer of short integer,
    // and convenience for display performance expantion.
    private boolean[] arrLight;

    // Constants for index of arrLight
    private final int A = 0;
    private final int B = 1;
    private final int C = 2;
    private final int D = 3;
    private final int E = 4;
    private final int F = 5;
    private final int G = 6;
    private final int POINT = 7;

    public SevenSegment() {
        arrLight = new boolean[8];
        clear();
    }

    // Setter: set a value for this segment.
    public void setValue(char value) {
        switch(value) {
            case '0':
                arrLight[A] = true;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = true;
                arrLight[E] = true;
                arrLight[F] = true;
                arrLight[G] = false;
                break;
            case '1':
                arrLight[A] = false;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = false;
                arrLight[E] = false;
                arrLight[F] = false;
                arrLight[G] = false;
                break;
            case '2':
                arrLight[A] = true;
                arrLight[B] = true;
                arrLight[C] = false;
                arrLight[D] = true;
                arrLight[E] = true;
                arrLight[F] = false;
                arrLight[G] = true;
                break;
            case '3':
                arrLight[A] = true;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = true;
                arrLight[E] = false;
                arrLight[F] = false;
                arrLight[G] = true;
                break;
            case '4':
                arrLight[A] = false;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = false;
                arrLight[E] = false;
                arrLight[F] = true;
                arrLight[G] = true;
                break;
            case '5':
                arrLight[A] = true;
                arrLight[B] = false;
                arrLight[C] = true;
                arrLight[D] = true;
                arrLight[E] = false;
                arrLight[F] = true;
                arrLight[G] = true;
                break;
            case '6':
                arrLight[A] = true;
                arrLight[B] = false;
                arrLight[C] = true;
                arrLight[D] = true;
                arrLight[E] = true;
                arrLight[F] = true;
                arrLight[G] = true;
                break;
            case '7':
                arrLight[A] = true;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = false;
                arrLight[E] = false;
                arrLight[F] = false;
                arrLight[G] = false;
                break;
            case '8':
                arrLight[A] = true;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = true;
                arrLight[E] = true;
                arrLight[F] = true;
                arrLight[G] = true;
                break;
            case '9':
                arrLight[A] = true;
                arrLight[B] = true;
                arrLight[C] = true;
                arrLight[D] = true;
                arrLight[E] = false;
                arrLight[F] = true;
                arrLight[G] = true;
                break;
            case '-':
                arrLight[A] = false;
                arrLight[B] = false;
                arrLight[C] = false;
                arrLight[D] = false;
                arrLight[E] = false;
                arrLight[F] = false;
                arrLight[G] = true;
                break;
            case 'E':
                arrLight[A] = true;
                arrLight[B] = false;
                arrLight[C] = false;
                arrLight[D] = true;
                arrLight[E] = true;
                arrLight[F] = true;
                arrLight[G] = true;
                break;
            case '\0':
                arrLight[A] = false;
                arrLight[B] = false;
                arrLight[C] = false;
                arrLight[D] = false;
                arrLight[E] = false;
                arrLight[F] = false;
                arrLight[G] = false;
                break;
            default:
                clear();
                break;
        }
    }

    public void setPoint(boolean b) {
        arrLight[POINT] = b;
    }

    // Clear value
    public void clear() {
        arrLight[A] = false;
        arrLight[B] = false;
        arrLight[C] = false;
        arrLight[D] = false;
        arrLight[E] = false;
        arrLight[F] = false;
        arrLight[G] = false;
        arrLight[POINT] = false;
    }

    // Getter
    public char getValue() {
        if(arrLight[A]) {
            if(arrLight[B]) {
                if(arrLight[C]) {
                    if(arrLight[D]) {
                        if(arrLight[E]) {
                            if(arrLight[F]) {
                                if(arrLight[G]) {
                                    return '8';
                                } else {
                                    return '0';
                                }
                            }
                        } else {
                            if(arrLight[F]) {
                                if(arrLight[G])
                                    return '9';
                            } else {
                                if(arrLight[G])
                                    return '3';
                            }
                        }
                    } else {
                        if(!arrLight[D] && !arrLight[E] && !arrLight[F] && !arrLight[G])
                            return '7';
                    }
                } else {
                    if(arrLight[D]  && arrLight[E]  && !arrLight[F] && arrLight[G]) {
                        return '2';
                    }
                }
            } else {
                if(arrLight[C]) {
                    if(arrLight[D]) {
                        if(arrLight[E]) {
                            if(arrLight[F]) {
                                if(arrLight[G]) {
                                    return '6';
                                }
                            }
                        } else
                        if(arrLight[F])
                            if(arrLight[G])
                                return '5';
                    }
                } else {
                    if(arrLight[D] && arrLight[E] && arrLight[F] && arrLight[G])
                        return 'E';

                }
            }
        } else {
            if(arrLight[B]) {
                if(arrLight[C] && !arrLight[D] && !arrLight[E]) {
                    if(arrLight[F]) {
                        if(arrLight[G])
                            return '4';
                    } else {
                        if(!arrLight[G])
                            return '1';
                    }
                }
            } else {
                if(!arrLight[C] && !arrLight[D] && !arrLight[E] && !arrLight[F] && !arrLight[G]) {
                    return '-';
                }
            }
        }

        // Otherwise, no show any.
        return '\0';
    }

    public boolean getPoint() { return arrLight[POINT]; }
}

// Display contains 8 digits of 7 segment and a display of memory and result values.
// An instance of this class is in MainActivity instance.
// It receives an input value from MainActivity, calculate value, and send the result
// to MainActivity.
class CalculatorUnit {
    // constants
    private final int DIGIT = 8;
    private final char MC = 'M';
    private final char MR = 'R';
    private final char MM = 'N';
    private final char MP = 'P';
    private final int MODE_MEMORY = 0;
    private final int MODE_RESULT = 1;
    private final int MODE_EQUAL_OVERLAY = 2;

    // fields
    private SevenSegment[] valueDisplay;
    private boolean memoryDisplay, positive, isError;
    private int valueX, valueY, memValue, eValue;
    private int accuracyX, accuracyY, accuracyMem;
    private char op, lastInput;

    public CalculatorUnit() {
        valueDisplay = new SevenSegment[DIGIT];
        for(int i = 0; i < DIGIT; i++) {
            valueDisplay[i] = new SevenSegment();
            if(i == DIGIT - 1) {
                valueDisplay[i].setValue('0');
                valueDisplay[i].setPoint(true);
            }
            else {
                valueDisplay[i].clear();
            }
        }
        memoryDisplay = false;
        positive = true;
        isError = false;
        valueX = 0;
        valueY = 0;
        memValue = 0;
        eValue = 0;
        accuracyX = 0;
        accuracyY = 0;
        accuracyMem = 0;
        op = '\0';
        lastInput = '\0';
    }

    // Getter
    public SevenSegment[] getValueDisplay() { return valueDisplay; }
    public boolean getMemoryDisplay() { return memoryDisplay; }
    public boolean getPositive() { return positive; }
    public boolean getError() { return isError; }
    public int getValueX() { return valueX; }
    public int getValueY() { return valueY; }
    public int getMemValue() { return memValue; }
    public int getAccuracyX() { return accuracyX; }
    public int getAccuracyY() { return accuracyY; }
    public int getAccuracyMem() { return accuracyMem; }
    public double geteValue() { return eValue; }
    public char getOp() { return op; }
    public char getLastInput() { return lastInput; }

    // Setter
    public void setValueDisplay(SevenSegment[] valueDisplay) {
        if(this.valueDisplay.length == valueDisplay.length)
            for(int i = 0; i < valueDisplay.length; i++) {
                this.valueDisplay[i].setValue(valueDisplay[i].getValue());
                this.valueDisplay[i].setPoint(valueDisplay[i].getPoint());
            }
    }
    public void setMemoryDisplay(boolean memoryDisplay) { this.memoryDisplay = memoryDisplay; }
    public void setPositive(boolean positive) { this.positive = positive; }
    public void setError(boolean isError) { this.isError = isError; }
    public void setValueX(int valueX) { this.valueX = valueX; }
    public void setValueY(int valueY) { this.valueY = valueY; }
    public void setMemValue(int memValue) { this.memValue = memValue; }
    public void seteValue(int eValue) { this.eValue = eValue; }
    public void setAccuracyX(int accuracyX) { this.accuracyX = accuracyX; }
    public void setAccuracyY(int accuracyY) { this.accuracyY = accuracyY; }
    public void setAccuracyMem(int accuracyMem) { this.accuracyMem = accuracyMem; }
    public void setOp(char op) { this.op = op; }
    public void setLastInput(char lastInput) { this.lastInput = lastInput; }    // External value input

    // Process input value
    public void processInputValue(char c) {
        if(isError && c != 'C') return;

        switch(c) {
            case MC:
                // Clean memory value.
                memoryDisplay = false;
                memValue = 0;
                accuracyMem = 0;
                break;
            case MR:
                if (memValue == 0) return;
                valueX = memValue;
                accuracyX = accuracyMem;
                // Recall memory value.
                break;
            case MM:
                arithmeticLogic(memValue, valueX, accuracyMem, accuracyX, '-', MODE_MEMORY);
                if (memValue != 0) memoryDisplay = true;
                // Subtract display value from memory value.
                break;
            case MP:
                arithmeticLogic(memValue, valueX, accuracyMem, accuracyX, '+', MODE_MEMORY);
                if (memValue != 0) memoryDisplay = true;
                // Add display value from memory value.
                break;
            case 'C':
                valueX = 0;
                accuracyX = 0;
                valueY = 0;
                accuracyY = 0;
                isError = false;
                eValue = 0;
                op = '\0';
                // Clear display and display value.
                break;
            case '~':
                positive = !positive;
                valueX = -valueX;
                // Shift display value positive/negative number.
                break;
            case '%':
                if (valueX > 0 && accuracyX >= -5)
                    accuracyX -= 2;
                else {
                    valueX = 0;
                    accuracyX = 0;
                }
                break;
            case '/':
            case '*':
            case '-':
            case '+':
                if(lastInput >= '0' && lastInput <= '9' || lastInput == '.')
                    arithmeticLogic(valueX, valueY, accuracyX, accuracyY, op, MODE_RESULT);
                op = c;
                break;
            case '=':
                if (op != '\0')
                    if(lastInput == '=')
                        arithmeticLogic(valueX, valueY, accuracyX, accuracyY, op, MODE_EQUAL_OVERLAY);
                    else
                        arithmeticLogic(valueX, valueY, accuracyX, accuracyY, op, MODE_RESULT);
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                // When valueX is full, nothing happens.
                if (Math.abs(valueX) >= 10000000)
                    return;
                switch (lastInput) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                        valueY = valueX;
                        accuracyY = accuracyX;
                        valueX = c - '0';
                        accuracyX = 0;
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '.':
                        valueX *= 10;
                        valueX += valueX >= 0 ? (c - '0') : -(c - '0');
                        if (lastInput == '.' || accuracyX < 0) accuracyX--;
                        break;
                    default:
                        valueX = c - '0';
                        accuracyX = 0;
                        break;
                }
                break;
            default:
                break;
        }

        updateValues();
        lastInput = c;
    }

    // Calculate values.
    private void arithmeticLogic(int valueA, int valueB, int accuracyA, int accuracyB,
                                 char opcode, int mode) {
        double resultValue = 0.0;
        int resultAccuracy = 0;

        switch(opcode) {
            case '+':
            case '-':
                while(accuracyA > accuracyB) {
                    valueA *= 10;
                    accuracyA--;
                }
                while(accuracyA < accuracyB) {
                    valueB *= 10;
                    accuracyB--;
                }
                valueA += opcode == '+' ? valueB :  - valueB;
                while(Math.abs(valueA) >= 100000000 && accuracyA < 0) {
                    valueA /= 10;
                    accuracyA++;
                }
                if(Math.abs(valueA) >= 100000000) {
                    while(valueA >= 10) {
                        valueA /= 10;
                        eValue++;
                    }
                    // In this case, lock all buttons but 'C' button.
                    isError = true;
                }
                break;
            case '*':
                valueA *= valueB;
                accuracyA += accuracyB;
                while(Math.abs(valueA) >= 100000000 && accuracyA < 0) {
                    valueA /= 10;
                    accuracyA++;
                }
                if(Math.abs(valueA) >= 100000000) {
                    while(valueA >= 10) {
                        valueA /= 10;
                        eValue++;
                    }
                    // In this case, lock all buttons but 'C' button.
                    isError = true;
                }
                break;
            case '/':
                resultValue = valueA / (double)valueB;
                while(resultValue < 1) {
                    resultValue *= 10;
                    resultAccuracy--;
                }
                if(resultAccuracy < -7) {
                    valueA = 0;
                    accuracyA = 0;
                }
                break;
            default:
                return;
        }

        switch(mode) {
            case MODE_MEMORY:
                memValue = valueA;
                accuracyMem = valueA;
                break;
            case MODE_RESULT:
                valueY = valueX;
                accuracyY = accuracyX;
                valueX = valueA;
                accuracyX = accuracyA;
                break;
            case MODE_EQUAL_OVERLAY:
                valueX = valueA;
                accuracyX = accuracyA;
                break;
        }
    }

    // Get digits of value.
    // Valid return value is 1 to 8.
    // Otherwise, return -1.
    private int digitsToDisplay() {
        int tmpValue = Math.abs(valueX);

        /*for(int i = 0; i < DIGIT; i++) {
            if(valueDisplay[i].getValue() != '0'
                    || valueDisplay[i].getPoint()) {
                return DIGIT - i;
            }
        }*/

        for(int i = 0; i < DIGIT; i++) {
            if(tmpValue / (int)Math.pow(10, DIGIT - i - 1) > 0
                    || i == accuracyX + DIGIT - 1) {
                if(DIGIT - i > 8 || DIGIT - i < 0)
                    break;
                return DIGIT - i;
            }
        }

        return -1;
    }

    private void updateValues() {
        int tmpValue = 0;

        // 1. Set result display.
        //   1-1. Initialize result display.
        for(int i = 0; i < DIGIT; i++) {
            valueDisplay[i].clear();
        }
        //   1-2. Set each value in result display.
        if(!isError) {
            for(int i = 0; i < DIGIT; i++) {
                if(i >= DIGIT - digitsToDisplay() && digitsToDisplay() > 0 ) {
                    valueDisplay[i].setPoint(i == accuracyX + DIGIT - 1);
                    tmpValue = Math.abs(valueX);
                    for (int j = 0; j < DIGIT - 1 - i; j++) {
                        tmpValue /= 10;
                    }
                    valueDisplay[i].setValue((char) (tmpValue % 10 + '0'));
                }
            }
        }
        else {
            int eDigit = 1, tmpEValue = eValue;
            while(tmpEValue >= 10) {
                tmpEValue /= 10;
                eDigit++;
            }
            for(int i = 0; i < 8; i++) {
                if(i == 7 - eDigit) {
                    valueDisplay[i].setValue((char)(valueX + '0'));
                    valueDisplay[i].setPoint(true);
                }
                else if(i == 6 - eDigit) {
                    valueDisplay[i].setValue('E');
                }
                else if(i >= 5 - eDigit) {
                    tmpEValue = eValue;
                    for(int j = 0; j < 7 - i; j++) {
                        tmpEValue /= 10;
                    }
                    valueDisplay[i].setValue((char)(tmpEValue % 10 - '0'));
                }
            }
        }
        // 2. Set memory display.
        memoryDisplay = memValue != 0;

        // 3. Set positive/negative display.
        positive = valueX >= 0;
    }
}
