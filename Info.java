public class Info {
    int andar;
    int direcao;
    int pessoas;

    double mudar() {
        if (direcao == 1) {
            andar = andar + 1;
        }
        if (direcao == 2) {
            andar = andar - 1;
        }
        return andar;
    }

    public Info(int direcao, int pessoas) {
        this.direcao = direcao;
        this.pessoas = pessoas;
    }
}
