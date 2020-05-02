use std::io;


fn main() {
        
    let vv = read_line_usize();

    let n = vv[0];
    let T = vv[1];

    let mut a: Vec<i32> = Vec::with_capacity(n);
    let mut t: Vec<i32> = Vec::with_capacity(n);

    for _ in 0..n {
        let vv = read_line_i32();
        a.push(vv[0]);
        t.push(vv[1]);
    }

    let mut res: Vec<i32> = Vec::new();
    let mut low: usize = 0;
    let mut high: usize = n;
    while low < high {
        let mid: usize = (low + high + 1) >> 1;
        let mut e: Vec<(i32, i32)> = Vec::new();
        for i in 0..n {
            if a[i] >= mid as i32 {
                e.push((t[i], i as i32));
            }
        }
        e.sort_by_key(|k| k.0);
        let mut ok = false;
        let len = e.len();
        if len >= mid {
            let mut sum = 0;
            for i in 0..mid {
                sum += e[i].0;
            }
            if sum <= T as i32 {
                ok = true;
                res.resize(mid, 0);
                for i in 0..mid {
                    res[i] = e[i].1;
                }
            }
        }
        if ok {
            low = mid;
        } else {
            high = mid - 1;
        }
    }
    let sz = res.len();
    println!("{:?}\n{:?}", sz, sz);
    for i in 0..sz {
        if i > 0 {
            print!(" ");
        }
        print!("{:?}", res[i] + 1);
    }
    println!();
}

fn pln(i: i32) {
    println!("{:?}", i);
}

fn read_int() -> i32 {
    let mut n = String::new();
    io::stdin()
        .read_line(&mut n)
        .expect("failed to read input.");

    let split = n.split(" ");
    let vec = split.collect::<Vec<&str>>();
    let n: i32 = vec[0].trim().parse().expect("invalid input");

    return n;
}

fn read_line_usize() -> Vec<usize> {
    let mut n = String::new();
    io::stdin()
        .read_line(&mut n)
        .expect("failed to read input.");

    let split = n.split(" ");
    let vec = split.collect::<Vec<&str>>();
    // println!("{:?}", vec.len());
    let mut veci: Vec<usize> = Vec::with_capacity(vec.len());
    for i in vec {
        veci.push(i.trim().parse().expect("invalid input"));
    }

    return veci;
}

fn read_line_i32() -> Vec<i32> {
    let mut n = String::new();
    io::stdin()
        .read_line(&mut n)
        .expect("failed to read input.");

    let split = n.split(" ");
    let vec = split.collect::<Vec<&str>>();
    let mut veci: Vec<i32> = Vec::with_capacity(vec.len());
    for i in vec {
        veci.push(i.trim().parse().expect("invalid input"));
    }

    return veci;
}
