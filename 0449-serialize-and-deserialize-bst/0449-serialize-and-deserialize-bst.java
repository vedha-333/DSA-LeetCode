class Codec {

    int i;

    public String serialize(TreeNode r) {
        return r == null ? "" :
               r.val + " " + serialize(r.left) + serialize(r.right);
    }

    public TreeNode deserialize(String d) {
        return build(d.split(" "), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    TreeNode build(String[] s, int min, int max) {

        if (i == s.length || s[i].equals("")) return null;

        int v = Integer.parseInt(s[i]);

        if (v < min || v > max) return null;

        i++;

        TreeNode r = new TreeNode(v);

        r.left = build(s, min, v);

        r.right = build(s, v, max);

        return r;
    }
}