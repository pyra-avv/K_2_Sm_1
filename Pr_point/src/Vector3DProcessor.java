public class Vector3DProcessor {
    public static Vector3D sum_vector(Vector3D v1, Vector3D v2) { // сумма векторов
        return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }
    public static Vector3D diff_vector(Vector3D v1, Vector3D v2) { // разность векторов
        return new Vector3D(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }
    public static Vector3D mult_vector(Vector3D v, double k) { // умножение вектора на число
        return new Vector3D(v.getX() * k, v.getY() * k, v.getZ() * k);
    }
    public static double sk_pr(Vector3D v1, Vector3D v2) { // скалярное произведение векторов
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public static Vector3D pr_vector(Vector3D v1, Vector3D v2) { // векторное произведение векторов
        return new Vector3D(v1.getY() * v2.getZ() - v1.getZ() * v2.getY(),
                v1.getZ() * v2.getX() - v1.getX() * v2.getZ(),
                v1.getX() * v2.getY() - v1.getY() * v2.getX());
    }

    public static boolean collinarity_check(Vector3D v1, Vector3D v2) { // проверка векторов на коллиниарность
        return Vector3D.ZERO.equals(pr_vector(v1, v2));
    }
}
