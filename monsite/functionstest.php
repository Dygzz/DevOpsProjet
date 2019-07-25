<?php
use PHPUnit\Framework\TestCase;
class functionstest extends TestCase
{
    public function testsiteName()
    {
        $this->expectOutputString('name');
        echo config('name');
    }

    public function testsiteVersion()
    {
        $this->expectOutputString('version');
        echo config('version');
    }
}

