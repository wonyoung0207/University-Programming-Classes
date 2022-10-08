
import java.util.*;
import java.util.Stack;

class Mazecell {
	int i;
	int j;
	int dir;

	public Mazecell(int _i, int _j, int _dir) {

		i = _i;
		j = _j;
		dir = _dir;

	}

	public String toString() {
		return "<" + i + "," + j + ">";

	}
}
