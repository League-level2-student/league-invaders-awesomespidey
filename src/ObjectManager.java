import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rs;
	Random random;
	ArrayList<Projectile> pj;
	ArrayList<Alien> al;

	ObjectManager(Rocketship rs) {
		this.rs = rs;
		pj = new ArrayList<Projectile>();
		al = new ArrayList<Alien>();
	}

	void addProjectile(Projectile pj) {

	}

	void addAlien() {
		al.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
	}

	void update() {
		for (int i = 0; i < pj.size(); i++) {
			Projectile p1= pj.get(i);
			p1.update();
			if(p1.y < 0) {
				p1.isActive = false;
		}}
		for (int i = 0; i < al.size(); i++) {
			Alien a1 = al.get(i);
			a1.update();
			
			if(a1.y > LeagueInvaders.HEIGHT) {
				a1.isActive = false;
			}
	}
}

}