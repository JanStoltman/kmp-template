//
//  ViewController.swift
//  ios
//
//  Created by Jan Stoltman on 17/05/2020.
//  Copyright © 2020 Jan Stoltman. All rights reserved.
//

import UIKit
import common

class ViewController: UIViewController {

    //MARK: Views
    @IBOutlet weak var helloUserLabelView: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        helloUserLabelView.text = HelloUserLabelRepository().obtainHelloUserLabel()
    }


}

