fn main() {
        println!("Oi");

        let p = (3, 5);

        println!("{:?}", p);
        println!("{:?}", p.0);
        println!("{:?}", p.1);

        let mut tuple_list = vec![(3,5), (0, 14), (1, 2), (3, 4), (2, 1), (5, 4), (4, 1)];
        println!("{:?}", tuple_list);
        tuple_list.sort_by_key(|k| k.0);
        println!("{:?}", tuple_list);
}
