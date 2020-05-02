

fn main() {
        


    /*let mut av: [Vec<i32>; 10];

    for i in 0..10 {
        av[i] = Vec::new();
    }

    av[0].push(33);*/

    let mut vv: Vec<Vec<i32>> = Vec::new();

    let v1 = vec![1987, 33];
    vv.push(v1);

    for x in &vv {
            println!("{:?}", x);
    }
}
