package extra;

public class Animation3D extends Animation implements Drawable, Renderable{

	public static void main(String[] args) {
		Animation3D animate3D = new Animation3D();
		
		
	}
	public Animation3D() {
		draw();
		render();
		System.out.println("FPS : " + getFrameRate());
	}
	
	
	
	
	@Override
	public void draw() {
		System.out.println("drawing");
		System.out.println("─────────▄▄───────────────────▄▄──");
		System.out.println("──────────▀█───────────────────▀█─");
		System.out.println("──────────▄█───────────────────▄█─");
		System.out.println("──█████████▀───────────█████████▀─");
		System.out.println("───▄██████▄─────────────▄██████▄──");
		System.out.println("─▄██▀────▀██▄─────────▄██▀────▀██▄");
		System.out.println("─██────────██─────────██────────██");
		System.out.println("─██───██───██─────────██───██───██");
		System.out.println("─██────────██─────────██────────██");
		System.out.println("──██▄────▄██───────────██▄────▄██─");
		System.out.println("───▀██████▀─────────────▀██████▀──");
		System.out.println("──────────────────────────────────");
		System.out.println("──────────────────────────────────");
		System.out.println("──────────────────────────────────");
		System.out.println("───────────█████████████──────────");
		System.out.println("──────────────────────────────────");
		System.out.println("──────────────────────────────────");
		System.out.println("──────────────────────────────────");
		
		//System.out.println("");
	}
	@Override
	public void render() {
		System.out.println("rendering\n");
		
		System.out.println("░░░▄██▀▀▀▀▀▀▀▀▀██████▄▄░░░░░░ ");
		System.out.println("░░█▀░░░░░░░░░░░▀▀███████░░░░░ ");
		System.out.println("░░█▌░░░░░░░░░░░░░░░▀██████░░░ ");
		System.out.println("░█▌░░░░░░░░░░░░░░░░███████▌░░ ");
		System.out.println("░█░░░░░░░░░░░░░░░░░████████░░ ");
		System.out.println("▐▌░░░░░░░░░░░░░░░░░▀██████▌░░ ");
		System.out.println("░▌▄███▌░░░░▀████▄░░░░▀████▌░░ ");
		System.out.println("▐▀▀▄█▄░▌░░░▄██▄▄▄▀░░░░████▄▄░ ");
		System.out.println("▐░▀░░═▐░░░░░░══░░▀░░░░▐▀░▄▀▌▌ ");
		System.out.println("▐░░░░░▌░░░░░░░░░░░░░░░▀░▀░░▌▌ ");
		System.out.println("▐░░░▄▀░░░▀░▌░░░░░░░░░░░░▌█░▌▌ ");
		System.out.println("░▌░░▀▀▄▄▀▀▄▌▌░░░░░░░░░░▐░▀▐▐░ ");
		System.out.println("░▌░░▌░▄▄▄▄░░░▌░░░░░░░░▐░░▀▐░░ ");
		System.out.println("░█░▐▄██████▄░▐░░░░░░░░█▀▄▄▀░░ ");
		System.out.println("░▐░▌▌░░░░░░▀▀▄▐░░░░░░█▌░░░░░░ ");
		System.out.println("░░█░░▄▀▀▀▀▄░▄═╝▄░░░▄▀░▌░░░░░░ ");
		System.out.println("░░░▌▐░░░░░░▌░▀▀░░▄▀░░▐░░░░░░░ ");
		System.out.println("░░░▀▄░░░░░░░░░▄▀▀░░░░█░░░░░░░ ");
		System.out.println("░░░▄█▄▄▄▄▄▄▄▀▀░░░░░░░▌▌░░░░░░ ");
		System.out.println("░░▄▀▌▀▌░░░░░░░░░░░░░▄▀▀▄░░░░░ ");
		System.out.println("▄▀░░▌░▀▄░░░░░░░░░░▄▀░░▌░▀▄░░░ ");
		System.out.println("░░░░▌█▄▄▀▄░░░░░░▄▀░░░░▌░░░▌▄▄ ");
		System.out.println("░░░▄▐██████▄▄░▄▀░░▄▄▄▄▌░░░░▄░ ");
		System.out.println("░░▄▌████████▄▄▄███████▌░░░░░▄ ");
		System.out.println("░▄▀░██████████████████▌▀▄░░░░ ");
		System.out.println("▀░░░█████▀▀░░░▀███████░░░▀▄░░ ");
		System.out.println("░░░░▐█▀░░░▐░░░░░▀████▌░░░░▀▄░ ");
		System.out.println("░░░░░░▌░░░▐░░░░▐░░▀▀█░░░░░░░▀ ");
		System.out.println("░░░░░░▐░░░░▌░░░▐░░░░░▌░░░░░░░ ");
		System.out.println("░╔╗║░╔═╗░═╦═░░░░░╔╗░░╔═╗░╦═╗░ ");
		System.out.println("░║║║░║░║░░║░░░░░░╠╩╗░╠═╣░║░║░ ");
		System.out.println("░║╚╝░╚═╝░░║░░░░░░╚═╝░║░║░╩═╝░ ");
		
		//System.out.println("\n\n\n");
	}
	@Override
	public int getFrameRate() {
		return 24;
	}
	
}
