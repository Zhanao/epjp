package s066;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    public String bark(int count) { // questo metodo bark non � quello della riga sopra perche chiede in entrata un parametro.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}