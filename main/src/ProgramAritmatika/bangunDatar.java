package ProgramAritmatika;

class bangunDatar {
    int s, p, l;

    bangunDatar(int s) {
        this.s = s;
    }

    bangunDatar(int p, int l) {
        this.p = p;
        this.l = l;
    }

    int HitungLuas(int s) {
        return s*s;
    }

    int HitungLuas(int p, int l) {
        return p * l;
    }
}
