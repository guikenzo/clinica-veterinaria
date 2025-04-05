package application;

public class Gato extends Animal {
	private Gato(Builder builder) {
        super(builder);
    }
	
	public static class Builder extends Animal.Builder {
		public Builder() {}
		
		@Override
        public Builder nomeAnimal(String nomeAnimal) {
            super.nomeAnimal = nomeAnimal;
            return this;
        }

        @Override
        public Builder idade(int idade) {
            super.idade = idade;
            return this;
        }

        @Override
        public Builder raca(String raca) {
            super.raca = raca;
            return this;
        }

        @Override
        public Builder dono(Dono dono) {
            super.dono = dono;
            return this;
        }

        @Override
        public Gato build() {
            return new Gato(this);
        }
	}
}
